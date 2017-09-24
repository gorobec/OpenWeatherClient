package com.snitsar.weather_response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sys {

    @JsonProperty(value = "type")
    private int type;
    @JsonProperty(value = "id")
    private int id;
    @JsonProperty(value = "message")
    private double message;
    @JsonProperty(value = "country")
    private String country;
    @JsonProperty(value = "sunrise")
    private long sunrise;
    @JsonProperty(value = "sunset")
    private long sunset;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getSunrise() {
        return sunrise;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sys sys = (Sys) o;

        if (type != sys.type) return false;
        if (id != sys.id) return false;
        if (Double.compare(sys.message, message) != 0) return false;
        if (sunrise != sys.sunrise) return false;
        if (sunset != sys.sunset) return false;
        return country != null ? country.equals(sys.country) : sys.country == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = type;
        result = 31 * result + id;
        temp = Double.doubleToLongBits(message);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (int) (sunrise ^ (sunrise >>> 32));
        result = 31 * result + (int) (sunset ^ (sunset >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sys{");
        sb.append("type=").append(type);
        sb.append(", id=").append(id);
        sb.append(", message=").append(message);
        sb.append(", country='").append(country).append('\'');
        sb.append(", sunrise=").append(sunrise);
        sb.append(", sunset=").append(sunset);
        sb.append('}');
        return sb.toString();
    }
}
