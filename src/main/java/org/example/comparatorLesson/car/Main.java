package org.example.comparatorLesson.car;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMV", 2200));
        cars.add(new Car("AUDI", 1200));
        cars.add(new Car("BMW", 3200));
        cars.add(new Car("RENO", 800));
        cars.add(new Car("FORD", 150));
        Collections.sort(cars);




       cars.forEach(System.out::println);


    }

}
