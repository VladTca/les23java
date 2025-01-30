public class Car extends Vehicle {

    private String color;
    private String korpus;


    public Car(String number, String brand, int year, int numberOfWheels, int motor, int numberOfDoors, String color, String korpus) {
        super(number, brand, year, numberOfWheels, motor, numberOfDoors);
        this.color = color;
        this.korpus = korpus;
    }

    public Car(String number, String brand, int year, int motor, String korpus) {
        this(number, brand, year, 4, motor, 4, "Цвет не указан", korpus);
    }

    public Car() {
        this("Номер не указан", "Лада", 1990, 4, 1599, 4, "Баклажан", "Седан");
    }

    @Override
    public void drive() {
        StringBuilder sb = new StringBuilder();
        sb.append("Поехали! ").append(this);
        System.out.println(sb);
    }

    @Override
    public String toString() {
        return String.format("\n\tМашина: %s, %s, %s", getBrand(), korpus, color);
    }
}
