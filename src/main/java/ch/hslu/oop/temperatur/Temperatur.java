package ch.hslu.oop.temperatur;

/**
 * Beispiel einer einfachen Klasse Temperatur
 */
public class Temperatur {

    /**
     * Exercise 1.3 a)
     * Stores current Temperatur Value in Celsius
     */
    private float tempCelsius;

    /**
     * Exercise 1.3 h)
     * Sets default value of 20.0 degrees in Celsius
     */
    Temperatur() {
        this.tempCelsius = 20.0f;
    }

    /**
     * Exercise 1.3 i)
     * @param tempCelsius: Sets default value in Celsius
     *                     If the Value is lower than -273.15 than the temperatur is automatically set to that number.
     */
    Temperatur(float tempCelsius) {
        this.tempCelsius = Math.max(tempCelsius, -273.15f);;
    }

    /**
     * Exercise 1.3 c)
     * @return float: Returns current Temperatur in Celsius
     */
    public float getTempCelsius() {
        return this.tempCelsius;
    }

    /**
     * Exercise 1.3 d)
     * @param tempCelsius: Sets current Temperatur to the new Temperatur in Celsius.
     *                     If the Value is lower than -273.15 than the temperatur is automatically set to that number.
     */
    public void setTempCelsius(float tempCelsius) {
        this.tempCelsius = Math.max(tempCelsius, -273.15f);
    }

    /**
     * Exercise 1.3 e)
     * @return float: Returns current Temperatur in Kelvin
     */
    public float getTempKelvin() {
        return this.tempCelsius + 273.15f;
    }

    /**
     * Exercise 1.3 f)
     * @return float: Returns current Temperatur in Fahrenheit
     */
    public float getTempFarhenheit() {
        return this.tempCelsius * 1.8f + 32.0f;
    }

    /**
     * Exercise 1.3 g)
     * @param temp: Adds a value to the current temperatur in Celsius or Kelvin.
     *              If value the result is lower than -273.15 then the value will be set to that number.
     */
    public void addTemp(float temp) {
        float newTemp = this.tempCelsius + temp;
        this.tempCelsius = Math.max(newTemp, -273.15f);
    }

    public String GetAggregatszustand(String element){
        float meltingTemp;
        float boilingTemp;
        switch (element) {
            case "N" :
                meltingTemp = -210;
                boilingTemp = -195;
                break;

            case "Pb" :
                meltingTemp = 327;
                boilingTemp = 1749;
                break;

            case "Hg" :
                meltingTemp = -38;
                boilingTemp = 357;
                break;
            default:
                return "This type of Data is known for this Element";

        }
        if(tempCelsius <= meltingTemp)
        {
            return "fest";
        }
        if(tempCelsius >= boilingTemp)
        {
            return "gasförmig";
        }
        return "fest";

    }

}