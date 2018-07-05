package ru.lession.lessions;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator c = new Calculator();
        c.add(1, 1);
        assertEquals(2, c.getRsult());
    }

    /*@Test
    public void addDiv() {
        Calculator c = new Calculator();
        c.div(1, 1);
        assertEquals(0, c.getRsult());
    }*/
}