package org.example.comparatorLesson.car;

import java.util.Objects;

public  class Car implements Comparable<Car> {
    private String model;
    private int price;


    public Car(String model, int price) {
        this.model = model;
        this.price = price;




    }







    public String getmodel() {
        return model;
    }

    public void setmodel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car Car = (Car) o;
        return price == Car.price && Objects.equals(model, Car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +

                '}';
    }

    @Override
    public int compareTo(Car o) {
        return model.compareTo(o.model) ;
    }
}
