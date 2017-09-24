package com.snitsar.weather_response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {

    @JsonProperty(value = "temp")
    private double temp;
    @JsonProperty(value = "pressure")
    private int pressure;
    @JsonProperty(value = "humidity")
    private int humidity;
    @JsonProperty(value = "temp_min")
    private int tempMin;
    @JsonProperty(value = "temp_max")
    private int tempMax;
    @JsonProperty(value = "sea_level")
    private int seaLevel;
    @JsonProperty(value = "grnd_level")
    private int groundLevel;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getTempMin() {
        return tempMin;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }

    public int getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public int getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(int seaLevel) {
        this.seaLevel = seaLevel;
    }

    public int getGroundLevel() {
        return groundLevel;
    }

    public void setGroundLevel(int groundLevel) {
        this.groundLevel = groundLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Main main = (Main) o;

        if (Double.compare(main.temp, temp) != 0) return false;
        if (pressure != main.pressure) return false;
        if (humidity != main.humidity) return false;
        if (tempMin != main.tempMin) return false;
        if (tempMax != main.tempMax) return false;
        if (seaLevel != main.seaLevel) return false;
        return groundLevel == main.groundLevel;

    }

    @Override
    public int hashCode() {
        int result;
        long temp1;
        temp1 = Double.doubleToLongBits(temp);
        result = (int) (temp1 ^ (temp1 >>> 32));
        result = 31 * result + pressure;
        result = 31 * result + humidity;
        result = 31 * result + tempMin;
        result = 31 * result + tempMax;
        result = 31 * result + seaLevel;
        result = 31 * result + groundLevel;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Main{");
        sb.append("temp=").append(temp);
        sb.append(", pressure=").append(pressure);
        sb.append(", humidity=").append(humidity);
        sb.append(", tempMin=").append(tempMin);
        sb.append(", tempMax=").append(tempMax);
        sb.append(", seaLevel=").append(seaLevel);
        sb.append(", groundLevel=").append(groundLevel);
        sb.append('}');
        return sb.toString();
    }
}
