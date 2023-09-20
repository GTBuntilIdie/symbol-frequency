package com.example.symbol_frequency.model;

public class SymbolFrequency {
    private Character character;
    private Integer count;

    public SymbolFrequency(Character character, Integer count) {
        this.character = character;
        this.count = count;
    }
    public SymbolFrequency() {
    }

    public Character getCharacter() {
        return character;
    }

    public Integer getCount() {
        return count;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public void setCount(Long count) {
        this.count = Math.toIntExact(count);
    }

    @Override
    public String toString() {
        return character + ":" + count ;
    }
}
