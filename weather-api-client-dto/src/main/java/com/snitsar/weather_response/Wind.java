package com.snitsar.weather_response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Wind {

    @JsonProperty(value = "speed")
    private int speed;
    @JsonProperty(value = "deg")
    private int deg;
    @JsonProperty(value = "gust")
    private int gust;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

    public int getGust() {
        return gust;
    }

    public void setGust(int gust) {
        this.gust = gust;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wind wind = (Wind) o;

        if (speed != wind.speed) return false;
        if (deg != wind.deg) return false;
        return gust == wind.gust;

    }

    @Override
    public int hashCode() {
        int result = speed;
        result = 31 * result + deg;
        result = 31 * result + gust;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Wind{");
        sb.append("speed=").append(speed);
        sb.append(", deg=").append(deg);
        sb.append(", gust=").append(gust);
        sb.append('}');
        return sb.toString();
    }
}