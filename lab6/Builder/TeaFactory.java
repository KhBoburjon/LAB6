package com.lab6.Builder;

public class TeaFactory {

    public static void prepareTea(Tea tea)
    {
        if(tea.hasPutTeaBags() && tea.isBoiled()) {

            if (tea.hasMilk() && tea.hasSugar()) {
                System.out.println("You prepared a tea with milk and sugar");
            } else if (!tea.hasMilk() && tea.hasSugar()) {
                System.out.println("You prepared a tea with sugar");
            } else if (tea.hasMilk() && !tea.hasSugar())
                System.out.println("You prepared a tea with milk");
            else
                System.out.println("You prepared a plain tea");
          }
        else if(!tea.isBoiled())
        {
            System.out.println("Please, boil water to prepare tea");
        }
        else
            System.out.println("Please, put a tea bag to prepare tea");
    }

}
