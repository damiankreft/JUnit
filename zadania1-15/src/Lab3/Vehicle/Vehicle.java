package Lab3.Vehicle;

import Lab3.Machine;

public class Vehicle extends Machine {
    public static final int MAX_VEHICLE_COUNT = 12;
    private static int vehiclesCount = 0;
    protected int vehicleNumber;
    protected double Power;
    protected double Rpm;

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber() {
        vehicleNumber = vehiclesCount;
    }

    public double getPower() {
        return Power;
    }

    public void setPower(double power) {
        Power = power;
    }

    public double getRpm() {
        return Rpm;
    }

    public void setRpm(double rpm) {
        Rpm = rpm;
    }

    public Vehicle(String make, String model, Lab3.Enums.Engine engine,
                   double engineCapacity, double power, double rpm) {
        super(make, model, engine, engineCapacity);
        vehiclesCount++;
        setVehicleNumber();
        setPower(power);
        setRpm(rpm);
    }

    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        DisplayVehicleNumber();
        DisplayPower();
        DisplayRpm();
    }

    protected void DisplayVehicleNumber() {
        System.out.println(String.format("Pojazd %s z %s", getVehicleNumber(), MAX_VEHICLE_COUNT));
    }

    protected void DisplayPower() {
        System.out.println("Moc: " + getPower() + " kW");
    }

    protected void DisplayRpm() {
        System.out.println("Maksymalny moment obrotowy: " + getRpm());
    }
}
