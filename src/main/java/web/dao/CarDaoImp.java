package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao{

    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Toyota", "Crown", 2011));
        carList.add(new Car("Toyota", "Land Cruiser", 2011));
        carList.add(new Car("Toyota", "Mark2", 1998));
        carList.add(new Car("Honda", "Civic", 2011));
        carList.add(new Car("Nissan", "Leaf", 2011));

    }
    @Override
    public List<Car> getCars(int count) {
        if (count >= carList.size()) {
            return carList;
        } else if (count < 0) {
            return Collections.emptyList();
        } else {
            return carList.subList(0, count);
        }
    }
}