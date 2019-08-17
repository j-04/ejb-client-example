package com.demoejb;

import javax.ejb.Stateless;

@Stateless
public class CalculatorBean implements RemoteCalculator {
    @Override
    public int add(int a, int b) {
        System.out.println(this);
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        System.out.println(this);
        return a - b;
    }
}
