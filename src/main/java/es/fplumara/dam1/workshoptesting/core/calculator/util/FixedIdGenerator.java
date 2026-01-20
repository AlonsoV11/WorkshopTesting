package es.fplumara.dam1.workshoptesting.core.calculator.util;

import java.util.UUID;

public class FixedIdGenerator implements IdGenerator {
    private final UUID fixed;
    public FixedIdGenerator(UUID fixed) { this.fixed = fixed; }
    @Override public UUID newId() { return fixed; }
}