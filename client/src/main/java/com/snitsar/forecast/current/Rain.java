
package com.snitsar.forecast.current;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="precipitationVolume3h" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rain", propOrder = {
    "precipitationVolume3H"
})
public class Rain {

    @XmlElement(name = "precipitationVolume3h")
    protected double precipitationVolume3H;

    /**
     * Gets the value of the precipitationVolume3H property.
     * 
     */
    public double getPrecipitationVolume3H() {
        return precipitationVolume3H;
    }

    /**
     * Sets the value of the precipitationVolume3H property.
     * 
     */
    public void setPrecipitationVolume3H(double value) {
        this.precipitationVolume3H = value;
    }

}
