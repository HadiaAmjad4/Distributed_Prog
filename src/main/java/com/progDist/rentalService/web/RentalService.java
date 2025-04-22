package com.progDist.rentalService.web;
import org.springframework.stereotype.Service;

import com.progDist.rentalService.data.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class RentalService {
    private final List<Car> cars = new ArrayList<>();

    public RentalService() {
        cars.add(new Car("AB-123-CD", "Peugeot", 220, "208"));
        cars.add(new Car("BC-456-EF", "Renault", 240, "Clio V"));
        cars.add(new Car("CD-789-GH", "Citroen", 210, "C3"));
        cars.add(new Car("DE-321-IJ", "Audi", 340, "A3"));
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public Car getCarByPlate(String plateNumber) {
        return cars.stream()
                .filter(car -> car.getPlateNumber().equalsIgnoreCase(plateNumber))
                .findFirst()
                .orElse(null);
    }

    public boolean removeCar(String plateNumber) {
        return cars.removeIf(car -> car.getPlateNumber().equalsIgnoreCase(plateNumber));
    }

    public boolean rentCar(String plateNumber) {
        Car car = getCarByPlate(plateNumber);
        if (car != null && !car.isRented()) {
            car.setRented(true);
            return true;
        }
        return false;
    }
    
}
