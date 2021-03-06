<?php if(!empty($errors)): ?>
    <?php foreach($errors as $error): ?>
        <p><?php echo $error; ?></p>
    <?php endforeach; ?>
<?php endif; ?>

<section class="container section">
    <form method="POST" action="/reservaciones" class="form">

        <!-- Datos del usuario -->
        <h2>Introduce tus datos</h2>
        <fieldset class="form-datos">
            <label for="nombre">Nombre</label>
            <input type="text" id="nombre" name="nombre" required>
            
            <label for="apellido">Apellido</label>
            <input type="text" id="apellido" name="apellido" required>
            
            <label for="email">Email</label>
            <input type="email" id="email" name="email" required>
        </fieldset>
        
        <!-- Mostrar tickets -->
        <h2>Tickets</h2>
        <fieldset class="form-tickets">
            <!-- Hidden -->
            <input type="hidden" name="pedido[ticketId]" value="0" id="ticket-id">

            <?php foreach($dates as $date): ?>
                <input id="_hidden-date-id" type="hidden" name="pedido[fechaId][]" value="<?php echo $date["id"]; ?>" disabled>
            <?php endforeach; ?>

            <div class="tickets">
                <!-- Crear card del ticket -->
                <?php foreach($tickets as $ticket): ?>
                    <div class="ticket" ticket-id="<?php echo $ticket["id"]; ?>" ticket-maxDates=<?php echo $ticket["nFechas"]; ?> ticket-price="<?php echo $ticket["precio"]; ?>">
                        <?php if($ticket["nFechas"] == 0): ?> <p class="ticket-header">Todos los dias!</p>
                        <?php elseif($ticket["nFechas"] == 1): ?> <p class="ticket-header">Pase por 1 día</p>
                        <?php else: ?> <p class="ticket-header">Pase por <?php echo $ticket["nFechas"]; ?> días!</p>
                        <?php endif; ?>

                        <h3 class="ticket-price">&dollar;<?php echo number_format($ticket["precio"]); ?></h3>
                        
                        <div class="ticket-benfs">
                            <?php foreach(json_decode($ticket["beneficios"]) as $ben): ?>
                                <p><span class="fas fa-check"></span> <?php echo $ben; ?></p>
                            <?php endforeach; ?>
                        </div>
                        
                        <p class="ticket-button">Seleccionar</p>
  
                        <!-- Mostrar fechas -->
                        <div class="ticket-dates display-none">
                            <!-- Todos los días -->
                            <?php if($ticket["nFechas"] == 0): ?> 
                                <p class="text-muted">Pase para los días:</p>

                                <div class="ticket-days">
                                    <?php foreach($dates as $date): ?>
                                        <p class="ticket-date"><span class="fas fa-check color-orange"></span> <?php echo utf8_encode(strftime("%A, %d %b", strtotime($date["fecha"]))); ?></p>
                                    <?php endforeach; ?>
                                </div>
                            <!-- 1 día -->
                            <?php elseif($ticket["nFechas"] == 1): ?>
                                <p class="text-muted">Selecciona un día</p>

                                <div class="ticket-days">
                                    <?php foreach($dates as $date): ?>
                                        <label class="ticket-date" for="ticket-day<?php echo $ticket["id"] . $date["id"]; ?>">
                                            <input 
                                                class="ticket-date-id"
                                                type="radio" 
                                                name="_invalid-dates" 
                                                id="ticket-day<?php echo $ticket["id"] . $date["id"]; ?>"
                                                date-id="<?php echo $date["id"] ?>"
                                            >
                                            <?php echo utf8_encode(strftime("%A, %d %b", strtotime($date["fecha"]))); ?>
                                        </label>
                                    <?php endforeach; ?>
                                </div>

                            <!-- 2+ días -->
                            <?php else: ?>
                                <p class="text-muted">Selecciona <?php echo $ticket["nFechas"]; ?> días</p>

                                <div class="ticket-days">
                                    <?php foreach($dates as $date): ?>
                                        <label class="ticket-date" for="ticket-day<?php echo $ticket["id"] . $date["id"]; ?>">
                                            <input
                                                class="ticket-date-id"
                                                type="checkbox" 
                                                id="ticket-day<?php echo $ticket["id"] . $date["id"]; ?>"
                                                date-id="<?php echo $date["id"] ?>"
                                            >
                                            <?php echo utf8_encode(strftime("%A, %d %b", strtotime($date["fecha"]))); ?>
                                        </label>
                                    <?php endforeach; ?>
                                </div>
                            <?php endif; ?>

                            <input type="button" value="Cancelar" class="btn btn-secondary" id="ticket-cancel">
                        </div>
                    </div>
                <?php endforeach; // $tickets ?>
            </div>
        </fieldset>


        <!-- EVENTOS -->
        <h2>Elige tus eventos</h2>
        <fieldset class="form-dates">
            <p class="date-default text-muted align-center">Selecciona un ticket para ver los eventos disponibles!</p>

            <!-- Fecha -->
            <?php foreach($dates as $date): ?>
                <div class="date display-none" date-id="<?php echo $date["id"]; ?>">
                    <h3 class="date-header"><?php echo utf8_encode(strftime("%A, %d %B del %Y", strtotime($date["fecha"])));; ?></h3>

                    <div class="date-events">
                        <!-- Categorias -->
                        <?php foreach($categories as $category): ?>
                            <div>
                                <h4 class="event-category"><?php echo $category["titulo"];?></h4>

                                <!-- Eventos -->
                                <?php foreach($events as $event): ?>
                                    <?php if(!($event["categoriaId"] == $category["id"] && $event["fechaId"] == $date["id"])) continue; ?>
                                    <label class="event-category__header" for="event_<?php echo $event["id"]; ?>">
                                        <input 
                                            type="checkbox" 
                                            name="pedido[eventoId][]" 
                                            id="event_<?php echo $event["id"]; ?>"
                                            value="<?php echo $event["id"]; ?>"
                                        >
                                        <time class="font-bold color-orange"><?php echo utf8_encode(strftime("%R", strtotime($event["hora"]))); ?></time> <?php echo $event["titulo"]; ?>
                                    </label>
                                <?php endforeach; ?>
                                <!-- Eventos/ -->
                            </div>
                        <?php endforeach; ?>
                        <!-- Categorias/ -->
                    </div>
                </div>
            <?php endforeach; ?>
            <!-- Fecha/ -->
        </fieldset>

        <h2>Pagos y extras</h2>
        <fieldset class="form-pagos">
            <div class="form-pagos_extra">
                <h3 class="pagos-header">Extras</h3>

                <div>
                    <label for="camisas">Camisa del evento $10 (promoción 7% dto.)</label>
                    <input name="pedido[camisas]" type="number" min="0" max="3" value="0" id="camisas">
                </div>

                <div>
                    <label for="etiquetas">Paquete de 10 etiquetas $2 (HTML, CSS3, JavaScript, Google, Chrome)</label>
                    <input name="pedido[etiquetas]" type="number" min="0" value="0" id="etiquetas">
                </div>

                <div>
                    <label for="regalo">Selecciona un regalo</label>
                    <select id="regalo" name="pedido[regalo]" required>
                        <option value="" disabled selected>-- Seleccione un regalo --</option>

                        <option value="pulsera">Pulsera</option>
                        <option value="etiquetas">Etiquetas</option>
                        <option value="plumas">Plumas</option>
                    </select>
                </div>

                <button id="calcular" class="btn btn-secondary">Calcular</button>
            </div>

            <div class="form-pagos_default">
                <p class="text-muted">Presiona en "Calcular" para obtener tu resumen!</p>
            </div>

            <div class="form-pagos_resumen display-none">
                <h3 class="pagos-header">Resumen</h3>

                <ul class="resumen-listado">
                </ul>

                <input type="hidden" name="pago" id="pago" value="0">
                <button type="submit" id="pagar" class="btn btn-primary">Pagar</button>
            </div>
        </fieldset>
    </form>
</section>
