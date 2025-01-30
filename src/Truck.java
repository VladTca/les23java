public class Truck extends Vehicle {

    private double capasity;
    private double fillCapasity;


    public Truck(String number, String brand, int year, int numberOFWheels, int motor, int numberOfDoors, double capasity,double fillCapasity) {
        super(number, brand, year, numberOFWheels, motor, numberOfDoors);
        this.capasity = capasity;
        this.fillCapasity=fillCapasity;
    }

    @Override
    public void drive() {
        System.out.printf("Поехали на траке! Грузоподъемность: %.2f тонн, заполнено %.2f тонн\n", capasity, fillCapasity);
    }


}
