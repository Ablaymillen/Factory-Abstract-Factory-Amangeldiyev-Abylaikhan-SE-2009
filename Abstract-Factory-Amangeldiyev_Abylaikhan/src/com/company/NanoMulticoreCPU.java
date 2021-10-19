package com.company;

public class NanoMulticoreCPU implements CPU {

    @Override
    public void cpuCharacteristics() {
        System.out.println("Doubled amount of transistors with multiple cores");
    }

    @Override
    public void turboMode() {
        System.out.println("Enhances speed of data flow and each core frequency");
    }
}
