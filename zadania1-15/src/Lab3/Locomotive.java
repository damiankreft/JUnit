package Lab3;

import Lab3.Enums.Engine;
import Lab3.Enums.Payload;

public class Locomotive extends Machine {
    private int CarsCount;
    private Payload Payload;

    public int getCarsCount() {
        return CarsCount;
    }

    private void setCarsCount(int carsCount) {
        CarsCount = carsCount;
    }

    public Payload getPayload() {
        return Payload;
    }

    private void setPayload(Payload payload) {
        Payload = payload;
    }

    public Locomotive(String make, String model, Engine engine, double engineCapacity, int carsCount, Payload payload) {
        super(make, model, engine, engineCapacity);
        setCarsCount(carsCount);
        setPayload(payload);
    }

    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        DisplayCarsCount();
        DisplayPayload();
    }

    protected void DisplayCarsCount() {
        System.out.println("Car count: " + getCarsCount());
    }

    protected void DisplayPayload() {
        System.out.println("Payload: " + getPayload());
    }
}
