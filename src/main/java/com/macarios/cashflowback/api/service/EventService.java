package com.macarios.cashflowback.api.service;

import com.macarios.cashflowback.api.entity.Event;

import java.util.List;
import java.util.Optional;

public interface EventService {
    List<Event> getEvents();
    Optional<Event> getEvent(Integer id);
    Event createEvent(Event event);
    Optional<Event> updateEvent(Integer id, Event event);
    void deleteEvent(Integer id);
}
