package com.snitsar.forecast.current;

import com.snitsar.constants.Units;
import com.snitsar.weather_response.WeatherResponse;
import org.glassfish.jersey.client.ClientConfig;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
@WebService
public class CurrentWeatherForOneLocation {

    private Client client;

    private WebTarget webTarget;

    private String apiKey;

    public CurrentWeatherForOneLocation() {
        this.apiKey = "d9d9fee255abd17b02bcb4a5b4ad4f38";
        ClientConfig config = new ClientConfig();
        this.client = ClientBuilder.newClient(config);
        this.webTarget = client.target("http://api.openweathermap.org/data/2.5/weather");
    }

    @WebMethod
    public WeatherResponse getCurrentWeatherByCityName(
            @WebParam(name = "cityName")String cityName,
            @WebParam(name = "unit")Units unit){
        WebTarget target = webTarget.queryParam("q", cityName).queryParam("units", unit);
        return getWeatherResponse(target);
    }

    @WebMethod
    public WeatherResponse getCurrentWeatherByCityNameWithCountyCode(
            @WebParam(name = "cityName")String cityName,
            @WebParam(name = "countryCode")String countryCode,
            @WebParam(name = "unit")Units unit){
        WebTarget target = webTarget.queryParam("q", cityName + "," + countryCode).queryParam("units", unit);
        return getWeatherResponse(target);
    }
    @WebMethod
    public WeatherResponse getCurrentWeatherByCityId(
            @WebParam(name = "cityId")int cityId,
            @WebParam(name = "unit")Units unit){
        WebTarget target = webTarget.queryParam("id", cityId).queryParam("units", unit);
        return getWeatherResponse(target);
    }

    public WeatherResponse getCurrentWeatherByGeographicCoordinates(
            @WebParam(name = "lon")double lon,
            @WebParam(name = "lat")double lat,
            @WebParam(name = "unit")Units unit){
        WebTarget target = webTarget.queryParam("lon", lon).queryParam("lat", lat).queryParam("units", unit);
        return getWeatherResponse(target);
    }

    public WeatherResponse getCurrentWeatherByZipCode(
            @WebParam(name = "zip")int zip,
            @WebParam(name = "unit")Units unit){
        WebTarget target = webTarget.queryParam("zip", zip).queryParam("units", unit);
        return getWeatherResponse(target);
    }

    private WeatherResponse getWeatherResponse(WebTarget webTarget) {
        Response response = webTarget.queryParam("appid", apiKey).request(MediaType.APPLICATION_JSON_TYPE).get(Response.class);
        return response.readEntity(WeatherResponse.class);
    }
}
