package com.company;

public class FactoryNano extends AbstractFactoryCPU {
    @Override
    CPU getCPU(String processorType) {
        if(processorType.equalsIgnoreCase("multicore")){
            return new NanoMulticoreCPU();
        }else if(processorType.equalsIgnoreCase("bus")){
            return new NanoBusCPU();
        }
        return null;
    }
}
