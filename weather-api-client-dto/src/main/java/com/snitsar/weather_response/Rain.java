package com.snitsar.weather_response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class Rain {
    @JsonProperty(value = "3h")
    private double precipitationVolume3h;

    public double getPrecipitationVolume3h() {
        return precipitationVolume3h;
    }

    public void setPrecipitationVolume3h(double precipitationVolume3h) {
        this.precipitationVolume3h = precipitationVolume3h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rain rain = (Rain) o;

        return Double.compare(rain.precipitationVolume3h, precipitationVolume3h) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(precipitationVolume3h);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rain{");
        sb.append("precipitationVolume3h=").append(precipitationVolume3h);
        sb.append('}');
        return sb.toString();
    }
}
