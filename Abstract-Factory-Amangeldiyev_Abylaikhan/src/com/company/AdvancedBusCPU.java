package com.company;

public class AdvancedBusCPU implements CPU {
    @Override
    public void cpuCharacteristics() {
        System.out.println("64bit FSB processor, enables more complex tasks to executed per clock");
    }

    @Override
    public void turboMode() {
        System.out.println("Turbo mode enhances frequency of CPU by 20 percent");
    }
}
