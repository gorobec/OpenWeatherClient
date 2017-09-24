
package com.snitsar.forecast.current;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wind complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wind">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gust" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="speed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wind", propOrder = {
    "deg",
    "gust",
    "speed"
})
public class Wind {

    protected int deg;
    protected int gust;
    protected int speed;

    /**
     * Gets the value of the deg property.
     * 
     */
    public int getDeg() {
        return deg;
    }

    /**
     * Sets the value of the deg property.
     * 
     */
    public void setDeg(int value) {
        this.deg = value;
    }

    /**
     * Gets the value of the gust property.
     * 
     */
    public int getGust() {
        return gust;
    }

    /**
     * Sets the value of the gust property.
     * 
     */
    public void setGust(int value) {
        this.gust = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     */
    public void setSpeed(int value) {
        this.speed = value;
    }

}
