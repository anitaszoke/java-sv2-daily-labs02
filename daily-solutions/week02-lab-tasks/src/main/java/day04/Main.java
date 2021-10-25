package day04;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        GasStation gasStation = new GasStation(500);

        System.out.println("Tankolás ára: "+gasStation.tank(car,42));
        car.setKm(700);

        System.out.println("Fogyasztás: "+ car.howManyFuel());

    }
}
