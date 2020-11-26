package com.lab6.Adapter;

public class MallardDuck implements Duck {

    @Override
    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public void quack() {
        System.out.println("I am quacking wak! wak!");
    }
}
