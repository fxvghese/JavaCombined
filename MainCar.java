package Mod2;

class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public void showModel() {
        System.out.println("Model: " + model);
    }
}

public class MainCar {
    public static void main(String[] args) {
        Car myCar = new Car("Porsche 911");

        myCar.showModel();
    }
}