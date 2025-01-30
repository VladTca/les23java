public class Vehicle {
    private String number;
    private String brand;
    private int year;
    private int numberOFWheels;
    private int motor;
    private int numberOfDoors;

    public Vehicle(String number, String brand, int year, int numberOFWheels, int motor, int numberOfDoors) {
        this.number = number;
        this.brand = brand;
        this.year = year;
        this.numberOFWheels = numberOFWheels;
        this.motor = motor;
        this.numberOfDoors = numberOfDoors;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberOFWheels() {
        return numberOFWheels;
    }

    public void setNumberOFWheels(int numberOFWheels) {
        this.numberOFWheels = numberOFWheels;
    }

    void drive() {
        System.out.println("Поехали!");
    }
}
