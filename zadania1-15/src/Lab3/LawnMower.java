package Lab3;

import Lab3.Enums.Engine;

public class LawnMower extends Machine {
    private boolean _hasMalaxator;
    private boolean _isPropelled;
    private int _bladeCount;

    public boolean hasMalaxator() {
        return _hasMalaxator;
    }

    public void setMalaxator(boolean _hasMalaxator) {
        this._hasMalaxator = _hasMalaxator;
    }

    public boolean hasPropulsion() {
        return _isPropelled;
    }

    public void setPropulsionPresence(boolean _isPropelled) {
        this._isPropelled = _isPropelled;
    }

    public int getBladeCount() {
        return _bladeCount;
    }

    public void setBladeCount(int _bladeCount) {
        this._bladeCount = _bladeCount;
    }

    public LawnMower(String make, String model, Engine engine,
                     double engineCapacity, int bladeCount, boolean hasMalaxator, boolean isPropelled) {
        super(make, model, engine, engineCapacity);
        setBladeCount(bladeCount);
        setMalaxator(hasMalaxator);
        setPropulsionPresence(isPropelled);
    }

    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        DisplayBladesCount();
        DisplayMalaxator();
        DisplayPropulsion();
    }

    protected void DisplayBladesCount() {
        System.out.println("Has " + getBladeCount() + " blades");
    }

    protected void DisplayMalaxator() {
        System.out.println("Has malaxator: " + hasMalaxator());
    }

    protected void DisplayPropulsion() {
        System.out.println("Is propelled: " + hasPropulsion());
    }
}
