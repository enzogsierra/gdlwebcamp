package ar.com.compustack.gdlwebcamp.controller;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.com.compustack.gdlwebcamp.model.Category;
import ar.com.compustack.gdlwebcamp.model.Guest;
import ar.com.compustack.gdlwebcamp.model.Ticket;
import ar.com.compustack.gdlwebcamp.repository.CategoryRepository;
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
    private TicketRepository ticketRepository;


    @GetMapping("/")
    public String index(Model model)
    {
        List<Guest> guests = guestRepository.findAll();
        List<Category> categories = categoryRepository.findAll();
        List<Ticket> tickets = ticketRepository.findAll();

        LocalTime time = LocalTime.now();

        model.addAttribute("guests", guests);
        model.addAttribute("categories", categories);
        model.addAttribute("tickets", tickets);
        model.addAttribute("time", time);
        return "index";
    }

    @GetMapping("/conferencia")
    public String conferencia(Model model)
    {
        return "conferencia";
    }
}
 