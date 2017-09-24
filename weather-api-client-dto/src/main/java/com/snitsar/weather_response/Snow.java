package com.snitsar.weather_response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class Snow {

    @JsonProperty(value = "3h")
    private double snowVolume;

    public double getSnowVolume() {
        return snowVolume;
    }

    public void setSnowVolume(double snowVolume) {
        this.snowVolume = snowVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Snow snow = (Snow) o;

        return Double.compare(snow.snowVolume, snowVolume) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(snowVolume);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Snow{");
        sb.append("snowVolume=").append(snowVolume);
        sb.append('}');
        return sb.toString();
    }
}
