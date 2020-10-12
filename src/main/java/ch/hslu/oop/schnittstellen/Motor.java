package ch.hslu.oop.schnittstellen;

public class Motor extends AbstractSwitchable {

    private boolean isOn = false;
    private final int rpm;

    public Motor(int rpm) {
        this.rpm = rpm;
    }

    public void arbeiten()
    {

    }


    @Override
    public void switchOn() {
        isOn = true;
    }

    @Override
    public void switchOff() {
        isOn = false;
    }

    @Override
    public boolean isSwitchedOn() {
        return isOn;
    }

    @Override
    public boolean isSwitchedOff() {
        return !isOn;
    }
}
