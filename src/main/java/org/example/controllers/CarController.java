package org.example.controllers;

import org.example.dao.CarDAO;
import org.example.dao.CarService;
import org.example.models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/show")
    public String showCars(Model model) {

       List<Car> cars = carService.getCars();

        model.addAttribute("cars", cars);
        return "show-cars";
    }

    @GetMapping("/audi")
    public String showAudi() {
        return "cars/Audi";
    }

    @GetMapping("/bmw")
    public String showBMW() {
        return "cars/BMW";
    }

    @GetMapping("/lada")
    public String showLada() {
        return "cars/Lada";
    }

    @GetMapping("/mercedes")
    public String showMercedes() {
        return "cars/Mercedes";
    }
}
