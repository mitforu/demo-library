package com.mitesh.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CalculateImplTest {

    @Test
    public void testSum(){
        Calculate calculate = new CalculateImpl();
        assertThat(calculate.sum(1,2)).isEqualTo(3);
    }
}