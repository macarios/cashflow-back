package com.macarios.cashflowback.api.service;

import com.macarios.cashflowback.api.entity.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface EventService {
    Page<Event> getEvents(Pageable pageable);
    Optional<Event> getEvent(Integer id);
    Event createEvent(Event event);
    Optional<Event> updateEvent(Integer id, Event event);
    void deleteEvent(Integer id);
}
