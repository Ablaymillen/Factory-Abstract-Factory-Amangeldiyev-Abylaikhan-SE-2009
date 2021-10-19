package com.company;

public class NanoBusCPU implements CPU{
    @Override
    public void cpuCharacteristics() {
        System.out.println("Nano advanced bus CPU has doubled amount of transistors on the circuit.");
    }

    @Override
    public void turboMode() {
        System.out.println("Boost mode enhances the speed of data transition by 20%");
    }
}
