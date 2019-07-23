package com.macarios.cashflowback.api.repository;

import com.macarios.cashflowback.api.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {
}
