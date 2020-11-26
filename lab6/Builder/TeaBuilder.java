package com.lab6.Builder;

public class TeaBuilder{
    private Tea tea;

    public TeaBuilder() {
        tea = new Tea();
    }
    public TeaBuilder putSugar(boolean sugar) {
        tea.setSugar(sugar);
        return this;
    }
    public TeaBuilder putMilk(boolean milk) {
        tea.setMilk(milk);
        return this;
    }

    public TeaBuilder putTeaBags(boolean bag)
    {
        tea.setTeaBags(bag);
        return this;
    }
    public TeaBuilder boil(boolean boil)
    {
      tea.setBoiled(boil);
      return this;
    }

    public Tea getTea()
    {
        return tea;
    }
}
