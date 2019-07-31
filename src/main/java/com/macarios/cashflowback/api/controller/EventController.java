package com.macarios.cashflowback.api.controller;

import com.macarios.cashflowback.api.entity.Event;
import com.macarios.cashflowback.api.service.EventService;
import com.macarios.cashflowback.api.service.impl.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping({"events/"})
public class EventController {

    private EventService eventService;
    public EventController(EventService eventService) {this.eventService = eventService;}

    @GetMapping(value = "")
    public List<Event> getEvents() {
        System.out.println("GET");
        return eventService.getEvents();
    }

    @GetMapping(value = "{id}")
    public Optional<Event> getEvent(@PathVariable Integer id) {
        return eventService.getEvent(id);
    }

    @PostMapping(value = "")
    public Event createEvent(@RequestBody Event event) {
        return eventService.createEvent(event);
    }

    @PutMapping(value = "{id}")
    public Optional<Event> updateEvent(@PathVariable Integer id, @RequestBody Event event) {
        return eventService.updateEvent(id, event);
    }

    @DeleteMapping(value = "{id}")
    public void deleteEvent(@PathVariable Integer id) {
        eventService.deleteEvent(id);
    }
}
