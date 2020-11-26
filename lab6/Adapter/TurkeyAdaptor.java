package com.lab6.Adapter;

public class TurkeyAdaptor implements Duck {
    private WildTurkey turkey;

    public TurkeyAdaptor(WildTurkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        turkey.fly();
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
