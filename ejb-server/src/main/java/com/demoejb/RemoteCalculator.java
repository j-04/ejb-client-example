package com.demoejb;

import javax.ejb.Remote;

@Remote
public interface RemoteCalculator {
    int add(int a, int b);
    int subtract(int a, int b);
}
