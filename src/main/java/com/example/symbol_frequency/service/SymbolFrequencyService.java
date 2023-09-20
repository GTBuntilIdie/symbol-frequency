package com.example.symbol_frequency.service;

import com.example.symbol_frequency.model.SymbolFrequency;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SymbolFrequencyService {
    public List<SymbolFrequency> calculateSymbolFrequency(String input) {
        Map<Character, Integer> characterFrequency = new HashMap<>();

        for (char c : input.toCharArray()) {
            characterFrequency.merge(c, 1, Integer::sum);
        }
        return characterFrequency.entrySet().stream()
                .map(entry -> new SymbolFrequency(entry.getKey(), entry.getValue()))
                .sorted(Comparator.comparingLong(SymbolFrequency::getCount).reversed())
                .collect(Collectors.toList());
    }
}








