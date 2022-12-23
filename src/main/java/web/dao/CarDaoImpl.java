package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    public static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Bentley", 1, 30000));
        cars.add(new Car("Cadillac", 2, 15000));
        cars.add(new Car("Bugatti", 3, 90000));
        cars.add(new Car("BMW", 4, 10000));
        cars.add(new Car("LADA", 5, 5000));
        cars.add(new Car("Pepsicola", 6, 125200));
        cars.add(new Car("Pepsicola", 6, 125200));
        cars.add(new Car("Pepsicola", 6, 125200));
        cars.add(new Car("Pepsicola", 6, 125200));
        cars.add(new Car("Pepsicola", 6, 125200));
        cars.add(new Car("Pepsicola", 6, 125200));
        cars.add(new Car("Pepsicola", 6, 125200));
        cars.add(new Car("Pepsicola", 6, 125200));


    }
}
