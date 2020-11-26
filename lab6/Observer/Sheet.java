package com.lab6.Observer;

public class Sheet implements Observer {
    DataSource dataSource;

    public Sheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Sheet got notified : " + dataSource.getValue());
    }

}
