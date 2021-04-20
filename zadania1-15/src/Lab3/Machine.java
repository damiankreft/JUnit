package Lab3;

import Lab3.Enums.Engine;

public abstract class Machine {
    protected String Make;
    protected String Model;
    protected Engine Engine = Lab3.Enums.Engine.None;
    protected double EngineCapacity;

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public Engine getEngine() {
        return Engine;
    }

    public void setEngine(Engine engine) {
        Engine = engine;
    }

    public double getEngineCapacity() {
        return EngineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        EngineCapacity = engineCapacity;
    }

    protected Machine(String make, String model, Engine engine, double engineCapacity) {
        setMake(make);
        setModel(model);
        setEngine(engine);
        setEngineCapacity(engineCapacity);
    }

    public void DisplayInfo() {
        DisplayMake();
        DisplayModel();
        DisplayEngine();
        DisplayEngineCapacity();
    }

    protected void DisplayMake() {
        System.out.println("Make: " + getMake());
    }

    protected void DisplayModel() {
        System.out.println("Model: " + getModel());
    }

    protected void DisplayEngine() {
        System.out.println("Engine type: " + getEngine());
    }

    protected void DisplayEngineCapacity() {
        System.out.println("Engine capacity: " + getEngineCapacity() + " ccm");
    }


}
