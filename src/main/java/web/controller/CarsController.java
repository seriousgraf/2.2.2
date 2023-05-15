package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarServiceImp;

import java.util.List;

@Controller
public class CarsController {

    private CarServiceImp CarServiceImp;
    @Autowired
    public void setCarService(CarServiceImp CarServiceImp) {
        this.CarServiceImp = CarServiceImp;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(required = false, defaultValue = "5") int count, Model model) {
        List<Car> cars = CarServiceImp.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }




    }
