package com.lab6.Adapter;

public class WildTurkey implements Turkey{
    @Override
    public void fly() {
        System.out.println("I am flying short");
    }

    @Override
    public void gobble() {
        System.out.println("I am gobbling");
    }
}
