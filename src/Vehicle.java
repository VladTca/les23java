/**
 * Базовый класс Vehicle представляет транспортное средство.
 */
public class Vehicle {
    private String number;
    private String brand;
    private int year;
    private int numberOFWheels;
    private int motor;
    private int numberOfDoors;

    /**
     * Конструктор для создания транспортного средства.
     *
     * @param number         Номер транспортного средства
     * @param brand          Марка транспортного средства
     * @param year           Год выпуска
     * @param numberOFWheels Количество колес
     * @param motor          Объем двигателя
     * @param numberOfDoors  Количество дверей
     */
    public Vehicle(String number, String brand, int year, int numberOFWheels, int motor, int numberOfDoors) {
        this.number = number;
        this.brand = brand;
        this.year = year;
        this.numberOFWheels = numberOFWheels;
        this.motor = motor;
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Метод для получения марки транспортного средства.
     *
     * @return Марка транспортного средства
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Метод для установки марки транспортного средства.
     *
     * @param brand Марка транспортного средства
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Метод для получения количества колес.
     *
     * @return Количество колес
     */
    public int getNumberOFWheels() {
        return numberOFWheels;
    }

    /**
     * Метод для установки количества колес.
     *
     * @param numberOFWheels Количество колес
     */
    public void setNumberOFWheels(int numberOFWheels) {
        this.numberOFWheels = numberOFWheels;
    }

    /**
     * Метод, который выводит информацию о движении транспортного средства.
     */
    void drive() {
        System.out.println("Поехали!");
    }
}
