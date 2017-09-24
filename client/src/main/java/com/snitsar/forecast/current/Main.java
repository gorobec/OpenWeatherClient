
package com.snitsar.forecast.current;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for main complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="main">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groundLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="humidity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pressure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="seaLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="temp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tempMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tempMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "main", propOrder = {
    "groundLevel",
    "humidity",
    "pressure",
    "seaLevel",
    "temp",
    "tempMax",
    "tempMin"
})
public class Main {

    protected int groundLevel;
    protected int humidity;
    protected int pressure;
    protected int seaLevel;
    protected double temp;
    protected int tempMax;
    protected int tempMin;

    /**
     * Gets the value of the groundLevel property.
     * 
     */
    public int getGroundLevel() {
        return groundLevel;
    }

    /**
     * Sets the value of the groundLevel property.
     * 
     */
    public void setGroundLevel(int value) {
        this.groundLevel = value;
    }

    /**
     * Gets the value of the humidity property.
     * 
     */
    public int getHumidity() {
        return humidity;
    }

    /**
     * Sets the value of the humidity property.
     * 
     */
    public void setHumidity(int value) {
        this.humidity = value;
    }

    /**
     * Gets the value of the pressure property.
     * 
     */
    public int getPressure() {
        return pressure;
    }

    /**
     * Sets the value of the pressure property.
     * 
     */
    public void setPressure(int value) {
        this.pressure = value;
    }

    /**
     * Gets the value of the seaLevel property.
     * 
     */
    public int getSeaLevel() {
        return seaLevel;
    }

    /**
     * Sets the value of the seaLevel property.
     * 
     */
    public void setSeaLevel(int value) {
        this.seaLevel = value;
    }

    /**
     * Gets the value of the temp property.
     * 
     */
    public double getTemp() {
        return temp;
    }

    /**
     * Sets the value of the temp property.
     * 
     */
    public void setTemp(double value) {
        this.temp = value;
    }

    /**
     * Gets the value of the tempMax property.
     * 
     */
    public int getTempMax() {
        return tempMax;
    }

    /**
     * Sets the value of the tempMax property.
     * 
     */
    public void setTempMax(int value) {
        this.tempMax = value;
    }

    /**
     * Gets the value of the tempMin property.
     * 
     */
    public int getTempMin() {
        return tempMin;
    }

    /**
     * Sets the value of the tempMin property.
     * 
     */
    public void setTempMin(int value) {
        this.tempMin = value;
    }

}
