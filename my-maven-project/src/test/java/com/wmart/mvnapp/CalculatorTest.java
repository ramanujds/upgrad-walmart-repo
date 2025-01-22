package com.wmart.mvnapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testAdd(){
        Calculator calc = new Calculator();
        Assertions.assertEquals(15,calc.add(6,4));
    }

}
