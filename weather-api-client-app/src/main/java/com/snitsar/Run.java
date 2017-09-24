package com.snitsar;

import com.snitsar.forecast.current.CurrentWeatherForOneLocation;

import javax.xml.ws.Endpoint;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class Run {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8082/current", new CurrentWeatherForOneLocation());
    }
}
