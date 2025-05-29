package com.ngo.tinus_houben.service;

import com.ngo.tinus_houben.model.Event;
import com.ngo.tinus_houben.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getLatestEvents() {
        return eventRepository.findTop10ByOrderByTimeDesc();
    }

    public Event saveEvent(Event event) {
        return eventRepository.save(event);
    }

    public Event getEventById(Long id) {
        return eventRepository.findById(id).orElse(null);
    }
}
