package dev.owlaaz.example.project1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * SampleController
 */
@RestController
public class SampleController {

    @GetMapping(value = "/hello", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<String> hello(@RequestParam(required = false) String name) {

        return new ResponseEntity<>("Hello " + name, HttpStatus.OK);
    }
}