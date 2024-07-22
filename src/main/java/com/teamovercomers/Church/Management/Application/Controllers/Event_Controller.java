package com.teamovercomers.Church.Management.Application.Controllers;

import com.teamovercomers.Church.Management.Application.entity.Church;
import com.teamovercomers.Church.Management.Application.entity.Event;
import com.teamovercomers.Church.Management.Application.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Events")
public class Event_Controller {
   @Autowired

    private EventService eventService;

    @GetMapping
    public List<Event> getAllChurches() {
       return eventService.getAllEvent();
   }
    @GetMapping("/{id}")
    public Event getEventById(@PathVariable Integer id) {
        return eventService.getById(id);
    }
    @PostMapping("/{id}")
    public Event createChurch(@RequestBody Event event) {
        return eventService.createEvent(event);

   }
    @PutMapping("/{id}")
    public Event updateEvent(@PathVariable Integer id, @RequestBody Event Event){
        return eventService.updateEvent(id, Event);
    }
    @PatchMapping("/{id}")
    public Event updatesEvent(@PathVariable Integer id, @RequestBody Event Event){
        return eventService.updateEvent(id, Event);
    }
    @DeleteMapping("/{id}")
    public Event DeleteEvent(@PathVariable Integer id){
        eventService.deleteEvent(id);
        return null;
    }

    }


