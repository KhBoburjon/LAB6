package com.lab6.Builder;

public class Tea {
    private boolean milk;
    private boolean sugar;
    private boolean boiled;
    private boolean teaBags;

    public boolean hasPutTeaBags() {
        return teaBags;
    }

    public void setTeaBags(boolean teaBags) {
        this.teaBags = teaBags;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void setBoiled(boolean boiled) {
        this.boiled = boiled;
    }

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

}

