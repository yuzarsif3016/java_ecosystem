package classes;

import interfaces.Car;
import interfaces.Vehicle;

public class Toyota implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Toyota is running");
    }

    @Override
    public void wheels() {
        System.out.println("4 - wheeler XUV");
    }
}
