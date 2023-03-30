-- Categorías
INSERT INTO gdlwebcamp.categories (title, icon) VALUES ('Seminario', 'fa-university');
INSERT INTO gdlwebcamp.categories (title, icon) VALUES ('Conferencia', 'fa-comment');
INSERT INTO gdlwebcamp.categories (title, icon) VALUES ('Taller', 'fa-code');


-- Fechas
INSERT INTO gdlwebcamp.dates (date) VALUES ('2021-12-09');
INSERT INTO gdlwebcamp.dates (date) VALUES ('2021-12-10');
INSERT INTO gdlwebcamp.dates (date) VALUES ('2021-12-11');


-- Invitados
INSERT INTO gdlwebcamp.guests (name, surname, description, imgUrl) VALUES ('Rafael', 'Bautista', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum iaculis auctor quam in suscipit', 'invitado1.jpg');
INSERT INTO gdlwebcamp.guests (name, surname, description, imgUrl) VALUES ('Shari', 'Herrera', 'Integer porttitor sem a malesuada elementum', 'invitado2.jpg');
INSERT INTO gdlwebcamp.guests (name, surname, description, imgUrl) VALUES ('Gregorio', 'Sánchez', 'Maecenas eget ex eu odio facilisis placerat dignissim nec magna', 'invitado3.jpg');
INSERT INTO gdlwebcamp.guests (name, surname, description, imgUrl) VALUES ('Susana', 'Rivera', 'Morbi nibh velit, dictum vel est et, porttitor maximus lacus. Nulla lobortis porttitor eros, in sagittis purus volutpat vitae', 'invitado4.jpg');
INSERT INTO gdlwebcamp.guests (name, surname, description, imgUrl) VALUES ('Harold', 'García', 'Praesent auctor a dui non faucibus. Vestibulum nec ipsum risus. Donec ac lacinia tellus.', 'invitado5.jpg');
INSERT INTO gdlwebcamp.guests (name, surname, description, imgUrl) VALUES ('María', 'Córdoba', 'Pellentesque tincidunt erat suscipit auctor ultricies. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae', 'invitado6.jpg');


-- Eventos
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('Responsive Web Design',                                       '10:00:00', '1', '3', '1');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('Flexbox',                                                     '12:00:00', '1', '3', '2');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('HTML5 y CSS3',                                                '14:00:00', '1', '3', '3');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('Drupal',                                                      '17:00:00', '1', '3', '4');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('WordPress',                                                   '19:00:00', '1', '3', '5');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('Cómo ser freelancer',                                         '10:00:00', '1', '2', '6');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('Tecnologías del Futuro',                                      '17:00:00', '1', '2', '1');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('Seguridad en la Web',                                         '19:00:00', '1', '2', '2');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('Diseño UX/UI para móviles',                                   '10:00:00', '1', '1', '6');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('AngularJS',                                                   '10:00:00', '2', '3', '1');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('PHP y MySQL',                                                 '12:00:00', '2', '3', '2');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('JavaScript Avanzado',                                         '14:00:00', '2', '3', '3');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('SEO en Google',                                               '17:00:00', '2', '3', '4');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('De Photoshop a HTML5 y CSS3',                                 '19:00:00', '2', '3', '5');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('PHP Intermedio y Avanzado',                                   '21:00:00', '2', '3', '6');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('Cómo crear una tienda online que venda millones en días',     '10:00:00', '2', '2', '6');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('Los mejores lugares para encontrar trabajo',                  '17:00:00', '2', '2', '1');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('Pasos para crear un negocio rentable ',                       '19:00:00', '2', '2', '2');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('Aprende a programar en una mañana',                           '10:00:00', '2', '1', '3');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('Programación Orientada a Objetos',                            '17:00:00', '2', '1', '5');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('Laravel',                                                     '10:00:00', '3', '3', '1');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('Crea tu propia API',                                          '12:00:00', '3', '3', '2');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('JavaScript y jQuery',                                         '14:00:00', '3', '3', '3');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('Creando plantillas para WordPress',                           '17:00:00', '3', '3', '4');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('Tiendas virtuales en Magento',                                '19:00:00', '3', '3', '5');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('Cómo hacer Marketing en línea',                               '10:00:00', '3', '2', '6');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('¿Con qué lenguaje debo empezar?',                             '17:00:00', '3', '2', '2');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('Frameworks y libreríaas Open Source',                         '19:00:00', '3', '2', '3');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('Creando una App en Android en una mañana',                    '10:00:00', '3', '1', '4');
INSERT INTO gdlwebcamp.events (title, time, date_id, category_id, guest_id) VALUES ('Creando una App en iOS en una tarde',                         '17:00:00', '3', '1', '1');


-- Tickets
INSERT INTO gdlwebcamp.tickets (price, nDates) VALUES ('30.0', 1);
INSERT INTO gdlwebcamp.tickets (price, nDates) VALUES ('50.0', 0);
INSERT INTO gdlwebcamp.tickets (price, nDates) VALUES ('45.0', 2);

INSERT INTO gdlwebcamp.ticket_benefits (ticket_id, benefits) VALUES ('1', 'Bocadillos gratis');
INSERT INTO gdlwebcamp.ticket_benefits (ticket_id, benefits) VALUES ('1', 'Todos los eventos');
INSERT INTO gdlwebcamp.ticket_benefits (ticket_id, benefits) VALUES ('2', 'Bocadillos gratis');
INSERT INTO gdlwebcamp.ticket_benefits (ticket_id, benefits) VALUES ('2', 'Todos los eventos');
INSERT INTO gdlwebcamp.ticket_benefits (ticket_id, benefits) VALUES ('2', 'Te llevas un regalo!');
INSERT INTO gdlwebcamp.ticket_benefits (ticket_id, benefits) VALUES ('3', 'Bocadillos gratis');
INSERT INTO gdlwebcamp.ticket_benefits (ticket_id, benefits) VALUES ('3', 'Todos los eventos');