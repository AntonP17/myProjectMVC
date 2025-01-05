package org.example.dao;

import org.example.models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// разделение ответственности для бизнес логики, он вызыввет методы репозитория
@Service
public class CarService {

    private final CarDAO carDAO;

    @Autowired
    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    public List<Car>    getCars() {
        return carDAO.getCars();
    }

    public void addCar(Car car) {
        carDAO.addCar(car);
    }
}
