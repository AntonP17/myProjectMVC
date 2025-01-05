package org.example.models;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
// стандартный класс модели , тут аннотаци компонент не нужна потому что это модель
public class Car {

    private String model;
    private int year;

    public Car(){
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
