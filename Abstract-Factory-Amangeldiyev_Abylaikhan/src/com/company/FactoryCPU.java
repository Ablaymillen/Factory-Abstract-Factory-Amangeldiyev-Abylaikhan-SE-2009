package com.company;

public class FactoryCPU extends AbstractFactoryCPU{
    @Override
    CPU getCPU(String processorType) {
        if(processorType.equalsIgnoreCase("multicore"))
        {
            return new MutlicoreCPU();
        }
        else if(processorType.equalsIgnoreCase("bus"))
        {
            return new AdvancedBusCPU();
        }
        return null;
    }
}
