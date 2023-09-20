package com.example.symbol_frequency;

import com.example.symbol_frequency.model.SymbolFrequency;
import com.example.symbol_frequency.service.SymbolFrequencyService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
class SymbolFrequencyApplicationTests {
    private final SymbolFrequencyService service = new SymbolFrequencyService();
    String input = "aaaaabcccc";

    private final SymbolFrequency first = new SymbolFrequency('a', 5);
    private final SymbolFrequency second = new SymbolFrequency('c', 4);
    private final SymbolFrequency three = new SymbolFrequency('b', 1);

    @Test
    void testCalculateSymbolFrequency( ) {
        List<SymbolFrequency> result = service.calculateSymbolFrequency(input);

        List<SymbolFrequency> symbolFrequencies = new ArrayList<>();
        symbolFrequencies.add(first);
        symbolFrequencies.add(second);
        symbolFrequencies.add(three);

        Assertions.assertEquals(symbolFrequencies, result);
    }

}
