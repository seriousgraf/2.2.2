package web.models;

import java.util.Objects;

public class Car {
    private String carBrand;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.carBrand = make;
        this.model = model;
        this.year = year;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
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


    @Override
    public String toString() {
        return "Car{" + "carBrand='" + carBrand + '\'' + ", model='" + model + '\'' + ", year=" + year + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && carBrand.equals(car.carBrand) && model.equals(car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, model, year);
    }
}