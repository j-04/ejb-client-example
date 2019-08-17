package com.demoejb;

import javax.ejb.Stateful;

@Stateful
public class CounterBean implements RemoteCounter {
    private int count = 0;

    @Override
    public void increment() {
        this.count++;
    }

    @Override
    public void decrement() {
        this.count--;
    }

    @Override
    public int getCount() {
        return this.count;
    }
}
