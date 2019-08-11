package com.macarios.cashflowback.api.repository;

import com.macarios.cashflowback.api.entity.Event;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EventRepository extends PagingAndSortingRepository<Event, Integer> {
}
