package com.demoejb;

import javax.ejb.Remote;

@Remote
public interface RemoteCounter {
    void increment();

    void decrement();

    int getCount();
}
