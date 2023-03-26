package org.example;

import java.util.Arrays;

public class Vaso {
    private int[] cap;

    public Vaso() {
        this.cap = new int[200];
    }

    public Vaso(int[] cap) {
        this.cap = cap;
    }

    public int[] getCap() {
        return cap;
    }

    public void setCap(int[] cap) {
        this.cap = cap;
    }

    @Override
    public String toString() {
        return "Vaso{" +
                "cap=" + Arrays.toString(cap) +
                '}';
    }
}
