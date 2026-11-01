package classes;

import interfaces.Car;
import interfaces.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle toyota = new Toyota();
        toyota.drive();
        toyota.wheels();

    }
}
