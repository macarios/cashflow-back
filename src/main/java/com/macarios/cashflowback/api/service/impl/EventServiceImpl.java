package com.macarios.cashflowback.api.service.impl;

import com.macarios.cashflowback.api.entity.Event;
import com.macarios.cashflowback.api.repository.EventRepository;
import com.macarios.cashflowback.api.service.EventService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImpl implements EventService {

    private EventRepository eventRepository;
    public EventServiceImpl(EventRepository eventRepository) {this.eventRepository = eventRepository;}

    public List<Event> getEvents() {
        return eventRepository.findAll();
    }

    public Optional<Event> getEvent(Integer id) {
        return eventRepository.findById(id);
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public Optional<Event> updateEvent(Integer id, Event event) {
        return eventRepository.findById(id)
                .map(newEvent -> {
                    newEvent.setDate(event.getDate());
                    newEvent.setKind(event.getKind());
                    newEvent.setDescription(event.getDescription());
                    newEvent.setReference(event.getReference());
                    newEvent.setValue(event.getValue());
                    newEvent.setNotes(event.getNotes());
                    return eventRepository.save(newEvent);
                });
    }

    public void deleteEvent(Integer id) {
        eventRepository.deleteById(id);
        // return "Evento removido com sucesso!";
    }
}
