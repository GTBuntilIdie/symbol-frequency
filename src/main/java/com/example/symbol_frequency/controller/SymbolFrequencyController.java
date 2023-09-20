package com.example.symbol_frequency.controller;

import com.example.symbol_frequency.model.SymbolFrequency;
import com.example.symbol_frequency.service.SymbolFrequencyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/symbol_frequency")
public class SymbolFrequencyController {
   private final SymbolFrequencyService service;

    public SymbolFrequencyController(SymbolFrequencyService service) {
        this.service = service;
    }

    @GetMapping
    public List<SymbolFrequency> calculateFrequency(@RequestParam("input") String input) {
        return service.calculateSymbolFrequency(input);
    }
}
