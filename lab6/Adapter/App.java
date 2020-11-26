package com.lab6.Adapter;

public class App {
    public static void main(String[] args) {


        Turkey turkey = new WildTurkey();
        Duck mallardDuck = new MallardDuck();
        Duck turkeyAdaptor = new TurkeyAdaptor((WildTurkey) turkey);

        System.out.println("Wild turkey says : ");
        turkey.fly();
        turkey.gobble();
        System.out.println("\n\n\nMallard duck Says : ");

        mallardDuck.fly();
        mallardDuck.quack();

        System.out.println("\n\n\nTurkey Adaptor says : ");

        turkeyAdaptor.fly();
        turkeyAdaptor.quack();
    }
}
