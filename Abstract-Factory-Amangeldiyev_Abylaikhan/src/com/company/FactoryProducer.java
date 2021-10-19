package com.company;

public class FactoryProducer {
    public static AbstractFactoryCPU getFactory(boolean nano){
        if(nano)
        {
            return new FactoryNano();
        }
        else
        {
            return new FactoryCPU();
        }
    }
}
