package com.company;

public class MutlicoreCPU implements CPU {

    @Override
    public void cpuCharacteristics() {
        System.out.println("Multi core CPU has multiple threads, multi tasking available");
    }

    @Override
    public void turboMode() {
        System.out.println("Each core frequency enhanced 1.5x");
    }
}
