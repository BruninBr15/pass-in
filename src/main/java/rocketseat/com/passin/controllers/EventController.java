package rocketseat.com.passin.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import rocketseat.com.passin.services.EventService;

@RestController
@RequestMapping("/events")
@RequiredArgsConstructor

public class EventController {
    private final EventService service;

    @GetMapping("/{eventId}")
    public ResponseEntity<String> getEvent(@PathVariable String eventId) {
        this.service.getEventDetail(eventId);
        ;
        return ResponseEntity.ok("Hello World!");
    }
}
