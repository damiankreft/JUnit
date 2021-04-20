package Lab3;

import Lab3.Enums.Vehicle.Segment;
import Lab3.Vehicle.Vehicle;

public class Car extends Vehicle {
    private Segment _segment = Segment.Unknown;
    private String _vin;

    public Segment getSegment() {
        return _segment;
    }

    public void setSegment(Segment segment) {
        this._segment = segment;
    }

    public String getVin() {
        return _vin;
    }

    public void setVin(String vin) {
        this._vin = _vin;
    }

    public Car(String make, String model, Lab3.Enums.Engine engine, double engineCapacity,
               double power, double rpm, String vin) {
        super(make, model, engine, engineCapacity, power, rpm);
        setVin(vin);
    }

    public Car(String make, String model, Lab3.Enums.Engine engine, double engineCapacity,
               double power, double rpm, Segment segment, String vin) {
        this(make, model, engine, engineCapacity, power, rpm, vin);
        setSegment(segment);
    }

    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println("Identified by VIN: " + getVin());
        System.out.println("Class: " + getSegment());
    }
}
