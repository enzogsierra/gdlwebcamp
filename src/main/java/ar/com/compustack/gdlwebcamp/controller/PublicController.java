package ar.com.compustack.gdlwebcamp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.com.compustack.gdlwebcamp.model.Category;
import ar.com.compustack.gdlwebcamp.model.CategoryEvent;
import ar.com.compustack.gdlwebcamp.model.Date;
import ar.com.compustack.gdlwebcamp.model.Guest;
import ar.com.compustack.gdlwebcamp.model.Ticket;
import ar.com.compustack.gdlwebcamp.repository.CategoryEventRepository;
import ar.com.compustack.gdlwebcamp.repository.CategoryRepository;
import ar.com.compustack.gdlwebcamp.repository.DateRepository;
import ar.com.compustack.gdlwebcamp.repository.GuestRepository;
import ar.com.compustack.gdlwebcamp.repository.TicketRepository;


@Controller
public class PublicController 
{
    @Autowired
    private GuestRepository guestRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryEventRepository eventRepository;

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private DateRepository dateRepository;


    @GetMapping("/")
    public String index(Model model)
    {
        List<Guest> guests = guestRepository.findAll();
        List<Category> categories = categoryRepository.findAll();
        List<Ticket> tickets = ticketRepository.findAll();

        model.addAttribute("guests", guests);
        model.addAttribute("categories", categories);
        model.addAttribute("tickets", tickets);
        return "index";
    }

    @GetMapping("/conferencia")
    public String conferencia(Model model)
    {
        return "conferencia";
    }

    @GetMapping("/calendario")
    public String calendario(Model model)
    {
        List<Date> dates = dateRepository.findAll();
        List<CategoryEvent> events = eventRepository.findAll();

        model.addAttribute("dates", dates);
        model.addAttribute("events", events);
        return "calendario";
    }

    @GetMapping("/invitados")
    public String invitados(Model model)
    {
        List<Guest> guests = guestRepository.findAll();

        model.addAttribute("guests", guests);
        return "invitados";
    }

    @GetMapping("/reservaciones")
    public String reservaciones(Model model)
    {
        List<Ticket> tickets = ticketRepository.findAll();
        List<Date> dates = dateRepository.findAll();
        List<Category> categories = categoryRepository.findAll();

        model.addAttribute("tickets", tickets);
        model.addAttribute("dates", dates);
        model.addAttribute("categories", categories);
        return "reservaciones";
    }
}
