package com.teamovercomers.Church.Management.Application.service;

import com.teamovercomers.Church.Management.Application.entity.Event;
import com.teamovercomers.Church.Management.Application.entity.Member;
import com.teamovercomers.Church.Management.Application.repository.EventRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class  EventService {
    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvent() {

        return eventRepository.findAll();
    }

    public Event getById(Integer id) {

        return eventRepository.findById(Integer.valueOf(id)).orElse(null);
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public Event updateEvent(Integer id, Event event) {
        Event existingEvent = eventRepository.findById(Math.toIntExact(id)).orElse(null);

        if (existingEvent != null) {
            existingEvent.setName(event.getName());
            existingEvent.setType(event.getType());
            existingEvent.setId(event.getId());

            return eventRepository.save(existingEvent);
        }
        return null;


    }
    public void deleteEvent(Integer id) {
        eventRepository.deleteById(id);
    }
}
