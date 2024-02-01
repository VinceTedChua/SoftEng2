public class CarTest {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder("Honda")
            .engineType("Diesel")
            .transmission("Manual")
            .color("Blue")
            .capacity(5)
            .build();

            System.out.println("Car Brand is: " + car.brand());
            System.out.println("Engine Type is: " + car.engineType());
            System.out.println("Transmission Type is: " + car.transmission());
            System.out.println("Color Type is: " + car.color());
            System.out.println("Seating Capacity: " + car.capacity());
            }

}
