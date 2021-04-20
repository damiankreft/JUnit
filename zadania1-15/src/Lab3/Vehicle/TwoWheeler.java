package Lab3.Vehicle;

import Lab3.Enums.Engine;
import Lab3.Enums.Vehicle.Type;

public class TwoWheeler extends Vehicle {
    private Type _type = Type.Unknown;

    public Type getType() {
        return _type;
    }

    public void setType(Type _type) {
        this._type = _type;
    }

    public TwoWheeler(String make, String model, Type type) {
        super(make, model, Engine.None, 0.0, 0.0, 0.0);
        setType(type);
    }

    public TwoWheeler(String make, String model, Engine engine,
                      double engineCapacity, double power, double rpm, Type type) {
        super(make, model, engine, engineCapacity, power, rpm);
        setType(type);
    }

    @Override
    public void DisplayInfo() {
        DisplayMake();
        DisplayModel();

        if (getEngine() != Engine.None) {
            DisplayEngine();
            DisplayEngineCapacity();
            DisplayPower();
            DisplayRpm();
        }

        DisplayType();
    }

    protected void DisplayType() {
        System.out.print("Type: " + getType());
    }
}
