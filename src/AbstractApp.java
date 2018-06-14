public class AbstractApp {
    public static void main(String[] args) {
        Car car = new Car("red","Porsche");
        Driver driver = new Driver();
        driver.setName("Bob");

        System.out.println("The " + car.vehicleColor + " " + car.carModel + " is being driven by " + driver.getName() + ".");
    }
}
