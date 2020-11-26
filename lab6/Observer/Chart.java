package com.lab6.Observer;

public class Chart implements Observer {
    DataSource dataSource;

    public Chart(DataSource data) {
        this.dataSource = data;
    }

    @Override
    public void update() {
        System.out.println("Chart got notified : " + dataSource.getValue());
    }
}
