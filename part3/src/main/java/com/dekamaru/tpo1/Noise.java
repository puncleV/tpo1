package com.dekamaru.tpo1;

public class Noise {
    private boolean shouted = false;

    public void suddenlyShout() {
        shouted = true;
    }

    public boolean isShout() {
        return shouted;
    }
}
