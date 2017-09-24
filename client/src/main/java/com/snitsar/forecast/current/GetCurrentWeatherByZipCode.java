
package com.snitsar.forecast.current;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCurrentWeatherByZipCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCurrentWeatherByZipCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zip" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="unit" type="{http://current.forecast.snitsar.com/}units" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCurrentWeatherByZipCode", propOrder = {
    "zip",
    "unit"
})
public class GetCurrentWeatherByZipCode {

    protected int zip;
    @XmlSchemaType(name = "string")
    protected Units unit;

    /**
     * Gets the value of the zip property.
     * 
     */
    public int getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     */
    public void setZip(int value) {
        this.zip = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link Units }
     *     
     */
    public Units getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Units }
     *     
     */
    public void setUnit(Units value) {
        this.unit = value;
    }

}
