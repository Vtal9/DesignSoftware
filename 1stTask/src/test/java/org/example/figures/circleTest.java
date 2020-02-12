package org.example.figures;

import org.junit.Test;

import static org.junit.Assert.*;

public class circleTest {

    @Test
    public void getArea() {
        assertEquals(12.56, new circle(2).getArea(), 1e-9);
        assertEquals(1.5386, new circle(0.7).getArea(), 1e-9);
    }
}