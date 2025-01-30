
public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("123xx", "Jaguar", 1990, 4, 2199, 2, "Красный", "Кабриолет");
        Car car3 = new Car("456xx", "Mercedes", 2020, 2699, "Седан");
        Truck truck1 = new Truck("789yy", "Volvo", 1990, 6, 6599, 2, 26, 23.4);
        Bus bus1 = new Bus("789", "Lada", 1990, 6, 1599, 4, 10);
        Tank tank1 = new Tank("T-34", 1943, 0, 6800);
        Vehicle[] vehicles = {car1, car2, car3, truck1, bus1, tank1};
        for (Vehicle vehicle : vehicles) {
            vehicle.drive();
        }
    }
}
