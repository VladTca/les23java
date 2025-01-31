/**
 * Класс Tank реализует танк.
 */

public class Tank extends Vehicle {
    private boolean hasGusenici;


    private Tank(String number, String brand, int year, int numberOFWheels, int motor, int numberOfDoors) {
        super(number, brand, year, numberOFWheels, motor, numberOfDoors);
    }

    public Tank(String brand, int year, int numberOFWheels, int motor) {
        super("Секретно", brand, year, numberOFWheels, motor, 0);

    }

    /**
     * Метод, который выводит информацию о движении танка.
     * <p>
     * Если у танка есть колеса, то он едет на них. Иначе, он использует гусеницы.
     */
    @Override
    public void drive() {
        if (getNumberOFWheels() != 0) {
            System.out.println("Поехали! Танк едет на " + getNumberOFWheels() + " по дороге!");
        } else {
            hasGusenici = true;
            System.out.println("Поехали! Танки грязи не боятся, у нас вместо колес гусеницы!");
        }
    }

}
