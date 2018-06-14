public class Car extends Vehicle{

    String carModel;
    Person driver;

    // default constructor
    public Car(){
    }

    // overloaded constructor
    public Car(String color, String model, Integer speed) {
        this.vehicleColor = color;
        this.carModel = model;
        this.speed = speed;
    }

    public Car(String color, String model) {
        this.vehicleColor = color;
        this.carModel = model;
    }

    public String SetSpeed(){
        return "The " + vehicleColor + " " + carModel + " is going " + speed + " mph.";
    }

    public String Start() {
        return "The " + vehicleColor + " " + carModel + " is starting.";
    }

    public String PassCar(Car newCar) {
        return "The " + vehicleColor + " " + carModel + " just passed the " + newCar.vehicleColor + " " + newCar.carModel + ".";
    }

    public String CheckEmissions(){
        return "The " + vehicleColor + " " + carModel + " has stopped to have its emissions checked.";
    }

    public String PassedEmissions(){
        return "The " + vehicleColor + " " + carModel + " passes its emissions test.";
    }


}
