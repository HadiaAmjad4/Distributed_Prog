package com.progDist.rentalService.web;

import com.progDist.rentalService.data.Car;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RentalController {

    private final RentalService rentalService;

    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }

    @GetMapping("cars")
    public List<Car> getAllCars() {
        return rentalService.getAllCars();
    }

    @GetMapping("/{plateNumber}")
    public Car getCarByPlate(@PathVariable String plateNumber) {
        return rentalService.getCarByPlate(plateNumber);
    }

    @PostMapping
    public void addCar(@RequestBody Car car) {
        rentalService.addCar(car);
    }

    @DeleteMapping("/{plateNumber}")
    public boolean deleteCar(@PathVariable String plateNumber) {
        return rentalService.removeCar(plateNumber);
    }

    @PutMapping("/{plateNumber}/rent")
    public boolean rentCar(@PathVariable String plateNumber) {
        return rentalService.rentCar(plateNumber);
    }
}
