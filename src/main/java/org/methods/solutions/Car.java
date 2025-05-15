package org.methods.solutions;

//!                             Declare the appropriate accessor and mutator
//!                             methods for this class. Output literal values to console.
class Car {
    String model = "Mustang";
    int topSpeed = 150;
    char color = 'r';

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getModel() + " " + car.getTopSpeed() + " " + car.getColor());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }
}
