package ch.hslu.oop.schnittstellen;

public abstract class ASwitchable implements ICountingSwitchable, INamed {

    boolean isOn;
    long switchCount = 0;
    String name;

    @Override
    public void switchOn() {
        switchCount++;
        isOn = true;
    }

    @Override
    public void switchOff() {
        switchCount++;
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

    @Override
    public long getSwitchCount()
    {
        return switchCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
