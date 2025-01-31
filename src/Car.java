/**
 * Класс Car представляет легковой автомобиль.
 */
public class Car extends Vehicle {

    private String color;
    private String korpus;

    /**
     * Конструктор для создания автомобиля.
     *
     * @param number         Номер автомобиля
     * @param brand          Марка автомобиля
     * @param year           Год выпуска
     * @param numberOfWheels Количество колес
     * @param motor          Объем двигателя
     * @param numberOfDoors  Количество дверей
     * @param color          Цвет автомобиля
     * @param korpus         Тип кузова
     */
    public Car(String number, String brand, int year, int numberOfWheels, int motor, int numberOfDoors, String color, String korpus) {
        super(number, brand, year, numberOfWheels, motor, numberOfDoors);
        this.color = color;
        this.korpus = korpus;
    }

    /**
     * Конструктор с заданным кузовом, но без указания цвета.
     */
    public Car(String number, String brand, int year, int motor, String korpus) {
        this(number, brand, year, 4, motor, 4, "Цвет не указан", korpus);
    }

    /**
     * Конструктор по умолчанию.
     */
    public Car() {
        this("Номер не указан", "Лада", 1990, 4, 1599, 4, "Баклажан", "Седан");
    }

    /**
     * Метод, который выводит информацию о движении автомобиля.
     */
    @Override
    public void drive() {
        StringBuilder sb = new StringBuilder();
        sb.append("Поехали! ").append(this.toString());
        System.out.println(sb.toString());
    }

    /**
     * Переопределенный метод toString().
     *
     * @return строковое представление автомобиля
     */
    @Override
    public String toString() {
        return String.format("Машина: %s, %s, %s", getBrand(), korpus, color);
    }
}
