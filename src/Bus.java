
/**
 * Класс Bus представляет автобус.
 */

public class Bus extends Vehicle {

    private int passengerAmount;

    public Bus(String number, String brand, int year, int numberOFWheels, int motor, int numberOfDoors, int passengerAmount) {
        super(number, brand, year, numberOFWheels, motor, numberOfDoors);
        this.passengerAmount = passengerAmount;
    }

    /**
     * Метод, который выводит информацию о движении автобуса.
     * Выводит сообщение о количестве перевозимых пассажиров.
     */
    @Override
    public void drive() {
        System.out.printf("Поехали на автобусе! Перевозится %d пассажиров\n", passengerAmount);
    }

}
