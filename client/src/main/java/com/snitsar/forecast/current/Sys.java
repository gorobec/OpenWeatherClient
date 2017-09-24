
package com.snitsar.forecast.current;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sys complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sys">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="sunrise" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sunset" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sys", propOrder = {
    "country",
    "id",
    "message",
    "sunrise",
    "sunset",
    "type"
})
public class Sys {

    protected String country;
    protected int id;
    protected double message;
    protected long sunrise;
    protected long sunset;
    protected int type;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the message property.
     * 
     */
    public double getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     */
    public void setMessage(double value) {
        this.message = value;
    }

    /**
     * Gets the value of the sunrise property.
     * 
     */
    public long getSunrise() {
        return sunrise;
    }

    /**
     * Sets the value of the sunrise property.
     * 
     */
    public void setSunrise(long value) {
        this.sunrise = value;
    }

    /**
     * Gets the value of the sunset property.
     * 
     */
    public long getSunset() {
        return sunset;
    }

    /**
     * Sets the value of the sunset property.
     * 
     */
    public void setSunset(long value) {
        this.sunset = value;
    }

    /**
     * Gets the value of the type property.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

}
