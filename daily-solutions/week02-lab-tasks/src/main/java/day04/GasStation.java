package day04;

public class GasStation {
    int price;

    public GasStation(int price) {
        this.price = price;
    }

    public int tank(Car car, int liter) {
        car.setFuel(liter);
        return price*liter;
    }
}
