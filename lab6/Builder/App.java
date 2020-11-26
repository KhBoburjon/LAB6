package com.lab6.Builder;

public class App {
    public static void main(String[] args) {
        Tea tea = new TeaBuilder().getTea();
        TeaFactory.prepareTea(tea);
    }


}
