package com.example.springboot.Esercizio_1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @GetMapping("/info")
    public ResponseEntity<?> info() {return new ResponseEntity<>(HttpStatus.OK);}
}