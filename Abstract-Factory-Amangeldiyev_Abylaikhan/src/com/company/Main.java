package com.company;

public class Main {

    public static void main(String[] args) {
        //factory of cpu without nano-technology
        AbstractFactoryCPU FactoryCPU = FactoryProducer.getFactory(false);

        //multicore cpu
        CPU multiCPU = FactoryCPU.getCPU("multicore");
        multiCPU.cpuCharacteristics();
        multiCPU.turboMode();

        //advanced bus cpu
        CPU advancedBus = FactoryCPU.getCPU("bus");
        advancedBus.cpuCharacteristics();
        advancedBus.turboMode();

        //factory of cpu WITH nano-technology
        AbstractFactoryCPU NanoCPU = FactoryProducer.getFactory(true);

        //nano multicore cpu
        CPU multiNanoCPU = NanoCPU.getCPU("multicore");
        multiNanoCPU.cpuCharacteristics();
        multiNanoCPU.turboMode();

        //nano advanced bus cpu
        CPU advancedNanoBus = NanoCPU.getCPU("bus");
        advancedNanoBus.cpuCharacteristics();
        advancedNanoBus.turboMode();
    }
}
