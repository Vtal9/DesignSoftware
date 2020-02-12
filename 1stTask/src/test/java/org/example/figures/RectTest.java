package org.example.figures;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectTest {

    @Test
    public void getArea() {
        assertEquals(6, new Rect(2,3).getArea(), 1e-9);
        assertEquals(2.1, new Rect(0.7, 3).getArea(), 1e-9);
    }
}