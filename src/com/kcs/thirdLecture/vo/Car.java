package com.kcs.thirdLecture.vo;

import java.util.Comparator;

/**
 * Created by andriusbaltrunas on 3/1/2017.
 */
public class Car implements Comparable<Car>{

    private String model;
    private String year;
    private double carPrice;

    public Car(){
    }

    public Car(String model, String year, double price){
        this.model = model;
        this.year = year;
        carPrice = price;
    }

    public Car(String model, String year, String carPrice){
        this.model = model;
        this.year = year;
        this.carPrice = Double.parseDouble(carPrice);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (Double.compare(car.getCarPrice(), getCarPrice()) != 0) return false;
        if (getModel() != null ? !getModel().equals(car.getModel()) : car.getModel() != null) return false;
        return !(getYear() != null ? !getYear().equals(car.getYear()) : car.getYear() != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getModel() != null ? getModel().hashCode() : 0;
        result = 31 * result + (getYear() != null ? getYear().hashCode() : 0);
        temp = Double.doubleToLongBits(getCarPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", carPrice=" + carPrice +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        //model.compareTo(o.getModel());
        if(carPrice > o.carPrice){
            return -1;
        }else if(carPrice < o.getCarPrice()){
            return 1;
        }else{
            return year.compareTo(o.getYear());
        }
    }
}
