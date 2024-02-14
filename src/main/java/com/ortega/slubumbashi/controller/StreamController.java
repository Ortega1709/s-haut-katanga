package com.ortega.slubumbashi.controller;

import com.ortega.slubumbashi.services.StreamService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/")
public class StreamController {

    private StreamService streamService;
    @GetMapping(value = "stream/songs", produces = "audio/mp3")
    public Mono<Resource> getSongByLink(@RequestParam("link") String link) {
        try {
            return streamService.getSong(link);
        } catch (Exception e) {
            log.error(e.getLocalizedMessage());
        }
        return null;
    }
}