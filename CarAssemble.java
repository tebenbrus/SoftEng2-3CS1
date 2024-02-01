public class CarAssemble{
    public static void main(String[]args){
        Car car = new Car.CarBuilder()
        .transmission("Automatic")
        .color("White")
        .engineType("Diesel")
        .passengerCapacity(5)
        .brand("Honda")
        .build();

        System.out.println("Brand: " + car.brand);
        System.out.println("Engine Type: " + car.engineType);
        System.out.println("Transmission: " + car.transmission);
        System.out.println("Color: " + car.color);
        System.out.println("Passenger Capacity: " + car.passengerCapacity);
        
    }
}