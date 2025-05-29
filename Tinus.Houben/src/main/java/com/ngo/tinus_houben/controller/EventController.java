package com.ngo.tinus_houben.controller;

import com.ngo.tinus_houben.model.Event;
import com.ngo.tinus_houben.service.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/events")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }


    @GetMapping
    public String index(Model model) {
        List<Event> events = eventService.getLatestEvents();
        model.addAttribute("events", events);
        return "events/index";
    }


    @GetMapping("/new")
    public String newEventForm(Model model) {
        model.addAttribute("event", new Event());
        return "events/new";
    }


    @PostMapping
    public String saveEvent(@ModelAttribute Event event) {
        eventService.saveEvent(event);
        return "redirect:/events";
    }


    @GetMapping("/{id}")
    public String showDetails(@PathVariable Long id, Model model) {
        Event event = eventService.getEventById(id);
        if (event == null) {
            return "redirect:/events";
        }
        model.addAttribute("event", event);
        return "events/details";
    }
}
