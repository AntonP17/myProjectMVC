package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
// SPRING MVC TEST
@Controller
public class HelloController {

    @GetMapping("/hello-world") // тут передаем параметры в гет запрос и они отображаются в консоли
    // передавать параметры всегда в запросе через теги : ?name=Anton&age=27
    // (после последнего запроса сначала вопрос , потом пары ключ=значение и через & разделяются)

    public String sayHello(@RequestParam("name") String name,
                           @RequestParam("age") int age) {
        // если написать required = false то необязательные параметры можно не передавать, значения будут null

        System.out.println(name + " " + age);

        return "Hello";

    }

    @GetMapping("/hello-world2") // тут в запросе передаем параметры, они отображаются теперь не в консоли а в браузере
    public String hsayHello2(@RequestParam("name") String name,
                             @RequestParam("age") int age,
                             Model model){


        model.addAttribute("message", name + " " + age);

        return "Hello";

    }

    @GetMapping("/calculate") // тут запрос калькулятора , передаем параметры и отображаем в браузере
    public String calculate(@RequestParam("a") int a,
                            @RequestParam("b") int b,
                            @RequestParam("operation") String operation,
                            Model model){

        double result;

        switch (operation) {
            case "plus" -> result = a + b;
            case "minus" -> result = a - b;
            case "multiply" -> result = a * b;
            case "divide" -> result = a / b;
            default -> result = 0;
        }

        model.addAttribute("result", result);

        return "calculate";
    }

}