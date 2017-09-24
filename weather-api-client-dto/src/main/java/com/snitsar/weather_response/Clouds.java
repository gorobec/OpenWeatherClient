package com.snitsar.weather_response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Clouds {

    @JsonProperty(value = "all")
    private int all;

    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clouds clouds = (Clouds) o;

        return all == clouds.all;

    }

    @Override
    public int hashCode() {
        return all;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clouds{");
        sb.append("all=").append(all);
        sb.append('}');
        return sb.toString();
    }
}
