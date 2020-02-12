package org.example.figures;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void getArea() {
        assertEquals(4, new Square(2).getArea(), 1e-9);
        assertEquals(0.49, new Square(0.7).getArea(), 1e-9);
    }
}