package org.example.dao;


import org.example.models.Car;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//взаимодействия контроллер - модель, доступ к модели через контроллер
@Repository
public class CarDAO {

    private List<Car> cars = new ArrayList<>();

    public CarDAO() {
        cars.add(new Car("Audi", 2005));
        cars.add(new Car("BMW", 2010));
        cars.add(new Car("Lada", 1999));
        cars.add(new Car("Mercedes", 2020));
    }

    public List<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }
}
