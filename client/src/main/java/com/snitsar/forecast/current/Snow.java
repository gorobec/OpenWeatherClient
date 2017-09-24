
package com.snitsar.forecast.current;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for snow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="snow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="snowVolume" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "snow", propOrder = {
    "snowVolume"
})
public class Snow {

    protected double snowVolume;

    /**
     * Gets the value of the snowVolume property.
     * 
     */
    public double getSnowVolume() {
        return snowVolume;
    }

    /**
     * Sets the value of the snowVolume property.
     * 
     */
    public void setSnowVolume(double value) {
        this.snowVolume = value;
    }

}
