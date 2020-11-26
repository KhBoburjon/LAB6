package com.lab6.Observer;

public class TestObserver {
    public static void main(String[] args) {
        DataSource dataSourceOfChart = new DataSource();
        DataSource dataSourceOfSheet = new DataSource();
        dataSourceOfChart.setValue(23);
        dataSourceOfSheet.setValue(45);
        Subject sub = new Subject();
        Chart chart = new Chart(dataSourceOfChart);
        Sheet sheet = new Sheet(dataSourceOfSheet);
        sub.addObserver(chart);
        sub.addObserver(sheet);
        sub.setValue(23);
    }
}

