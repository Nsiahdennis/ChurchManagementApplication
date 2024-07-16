package com.teamovercomers.Church.Management.Application.service;

import com.teamovercomers.Church.Management.Application.entity.Church;
import com.teamovercomers.Church.Management.Application.entity.Event;
import com.teamovercomers.Church.Management.Application.repository.EventRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;
    public List<Event>getAllEvent(){
        return eventRepository.findAll();
    }
    public Event getById(Integer id){
        return eventRepository.findById(Long.valueOf(id)).orElse(null);
    }
    //@PostMapping
   // public Event createEvent(@RequestBody Event event) {

       // return eventService.createEvent(event);
    }
//}
