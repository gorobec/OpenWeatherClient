
package com.snitsar.forecast.current;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for weatherResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="weatherResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="base" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clouds" type="{http://current.forecast.snitsar.com/}clouds" minOccurs="0"/>
 *         &lt;element name="cod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="coord" type="{http://current.forecast.snitsar.com/}coord" minOccurs="0"/>
 *         &lt;element name="dt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="main" type="{http://current.forecast.snitsar.com/}main" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rain" type="{http://current.forecast.snitsar.com/}rain" minOccurs="0"/>
 *         &lt;element name="snow" type="{http://current.forecast.snitsar.com/}snow" minOccurs="0"/>
 *         &lt;element name="sys" type="{http://current.forecast.snitsar.com/}sys" minOccurs="0"/>
 *         &lt;element name="visibility" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="weather" type="{http://current.forecast.snitsar.com/}weather" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wind" type="{http://current.forecast.snitsar.com/}wind" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "weatherResponse", propOrder = {
    "base",
    "clouds",
    "cod",
    "coord",
    "dt",
    "id",
    "main",
    "message",
    "name",
    "rain",
    "snow",
    "sys",
    "visibility",
    "weather",
    "wind"
})
public class WeatherResponse {

    protected String base;
    protected Clouds clouds;
    protected int cod;
    protected Coord coord;
    protected long dt;
    protected int id;
    protected Main main;
    protected String message;
    protected String name;
    protected Rain rain;
    protected Snow snow;
    protected Sys sys;
    protected int visibility;
    @XmlElement(nillable = true)
    protected List<Weather> weather;
    protected Wind wind;

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Gets the value of the clouds property.
     * 
     * @return
     *     possible object is
     *     {@link Clouds }
     *     
     */
    public Clouds getClouds() {
        return clouds;
    }

    /**
     * Sets the value of the clouds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Clouds }
     *     
     */
    public void setClouds(Clouds value) {
        this.clouds = value;
    }

    /**
     * Gets the value of the cod property.
     * 
     */
    public int getCod() {
        return cod;
    }

    /**
     * Sets the value of the cod property.
     * 
     */
    public void setCod(int value) {
        this.cod = value;
    }

    /**
     * Gets the value of the coord property.
     * 
     * @return
     *     possible object is
     *     {@link Coord }
     *     
     */
    public Coord getCoord() {
        return coord;
    }

    /**
     * Sets the value of the coord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coord }
     *     
     */
    public void setCoord(Coord value) {
        this.coord = value;
    }

    /**
     * Gets the value of the dt property.
     * 
     */
    public long getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     */
    public void setDt(long value) {
        this.dt = value;
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
     * Gets the value of the main property.
     * 
     * @return
     *     possible object is
     *     {@link Main }
     *     
     */
    public Main getMain() {
        return main;
    }

    /**
     * Sets the value of the main property.
     * 
     * @param value
     *     allowed object is
     *     {@link Main }
     *     
     */
    public void setMain(Main value) {
        this.main = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the rain property.
     * 
     * @return
     *     possible object is
     *     {@link Rain }
     *     
     */
    public Rain getRain() {
        return rain;
    }

    /**
     * Sets the value of the rain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rain }
     *     
     */
    public void setRain(Rain value) {
        this.rain = value;
    }

    /**
     * Gets the value of the snow property.
     * 
     * @return
     *     possible object is
     *     {@link Snow }
     *     
     */
    public Snow getSnow() {
        return snow;
    }

    /**
     * Sets the value of the snow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Snow }
     *     
     */
    public void setSnow(Snow value) {
        this.snow = value;
    }

    /**
     * Gets the value of the sys property.
     * 
     * @return
     *     possible object is
     *     {@link Sys }
     *     
     */
    public Sys getSys() {
        return sys;
    }

    /**
     * Sets the value of the sys property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sys }
     *     
     */
    public void setSys(Sys value) {
        this.sys = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     */
    public int getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     */
    public void setVisibility(int value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the weather property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weather property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeather().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Weather }
     * 
     * 
     */
    public List<Weather> getWeather() {
        if (weather == null) {
            weather = new ArrayList<Weather>();
        }
        return this.weather;
    }

    /**
     * Gets the value of the wind property.
     * 
     * @return
     *     possible object is
     *     {@link Wind }
     *     
     */
    public Wind getWind() {
        return wind;
    }

    /**
     * Sets the value of the wind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wind }
     *     
     */
    public void setWind(Wind value) {
        this.wind = value;
    }

}
