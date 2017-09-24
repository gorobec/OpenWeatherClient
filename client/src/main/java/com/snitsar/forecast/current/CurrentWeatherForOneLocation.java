
package com.snitsar.forecast.current;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CurrentWeatherForOneLocation", targetNamespace = "http://current.forecast.snitsar.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CurrentWeatherForOneLocation {


    /**
     * 
     * @param unit
     * @param lon
     * @param lat
     * @return
     *     returns com.snitsar.forecast.current.WeatherResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCurrentWeatherByGeographicCoordinates", targetNamespace = "http://current.forecast.snitsar.com/", className = "com.snitsar.forecast.current.GetCurrentWeatherByGeographicCoordinates")
    @ResponseWrapper(localName = "getCurrentWeatherByGeographicCoordinatesResponse", targetNamespace = "http://current.forecast.snitsar.com/", className = "com.snitsar.forecast.current.GetCurrentWeatherByGeographicCoordinatesResponse")
    @Action(input = "http://current.forecast.snitsar.com/CurrentWeatherForOneLocation/getCurrentWeatherByGeographicCoordinatesRequest", output = "http://current.forecast.snitsar.com/CurrentWeatherForOneLocation/getCurrentWeatherByGeographicCoordinatesResponse")
    public WeatherResponse getCurrentWeatherByGeographicCoordinates(
        @WebParam(name = "lon", targetNamespace = "")
        double lon,
        @WebParam(name = "lat", targetNamespace = "")
        double lat,
        @WebParam(name = "unit", targetNamespace = "")
        Units unit);

    /**
     * 
     * @param unit
     * @param cityName
     * @param countryCode
     * @return
     *     returns com.snitsar.forecast.current.WeatherResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCurrentWeatherByCityNameWithCountyCode", targetNamespace = "http://current.forecast.snitsar.com/", className = "com.snitsar.forecast.current.GetCurrentWeatherByCityNameWithCountyCode")
    @ResponseWrapper(localName = "getCurrentWeatherByCityNameWithCountyCodeResponse", targetNamespace = "http://current.forecast.snitsar.com/", className = "com.snitsar.forecast.current.GetCurrentWeatherByCityNameWithCountyCodeResponse")
    @Action(input = "http://current.forecast.snitsar.com/CurrentWeatherForOneLocation/getCurrentWeatherByCityNameWithCountyCodeRequest", output = "http://current.forecast.snitsar.com/CurrentWeatherForOneLocation/getCurrentWeatherByCityNameWithCountyCodeResponse")
    public WeatherResponse getCurrentWeatherByCityNameWithCountyCode(
        @WebParam(name = "cityName", targetNamespace = "")
        String cityName,
        @WebParam(name = "countryCode", targetNamespace = "")
        String countryCode,
        @WebParam(name = "unit", targetNamespace = "")
        Units unit);

    /**
     * 
     * @param unit
     * @param cityName
     * @return
     *     returns com.snitsar.forecast.current.WeatherResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCurrentWeatherByCityName", targetNamespace = "http://current.forecast.snitsar.com/", className = "com.snitsar.forecast.current.GetCurrentWeatherByCityName")
    @ResponseWrapper(localName = "getCurrentWeatherByCityNameResponse", targetNamespace = "http://current.forecast.snitsar.com/", className = "com.snitsar.forecast.current.GetCurrentWeatherByCityNameResponse")
    @Action(input = "http://current.forecast.snitsar.com/CurrentWeatherForOneLocation/getCurrentWeatherByCityNameRequest", output = "http://current.forecast.snitsar.com/CurrentWeatherForOneLocation/getCurrentWeatherByCityNameResponse")
    public WeatherResponse getCurrentWeatherByCityName(
        @WebParam(name = "cityName", targetNamespace = "")
        String cityName,
        @WebParam(name = "unit", targetNamespace = "")
        Units unit);

    /**
     * 
     * @param zip
     * @param unit
     * @return
     *     returns com.snitsar.forecast.current.WeatherResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCurrentWeatherByZipCode", targetNamespace = "http://current.forecast.snitsar.com/", className = "com.snitsar.forecast.current.GetCurrentWeatherByZipCode")
    @ResponseWrapper(localName = "getCurrentWeatherByZipCodeResponse", targetNamespace = "http://current.forecast.snitsar.com/", className = "com.snitsar.forecast.current.GetCurrentWeatherByZipCodeResponse")
    @Action(input = "http://current.forecast.snitsar.com/CurrentWeatherForOneLocation/getCurrentWeatherByZipCodeRequest", output = "http://current.forecast.snitsar.com/CurrentWeatherForOneLocation/getCurrentWeatherByZipCodeResponse")
    public WeatherResponse getCurrentWeatherByZipCode(
        @WebParam(name = "zip", targetNamespace = "")
        int zip,
        @WebParam(name = "unit", targetNamespace = "")
        Units unit);

    /**
     * 
     * @param unit
     * @param cityId
     * @return
     *     returns com.snitsar.forecast.current.WeatherResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCurrentWeatherByCityId", targetNamespace = "http://current.forecast.snitsar.com/", className = "com.snitsar.forecast.current.GetCurrentWeatherByCityId")
    @ResponseWrapper(localName = "getCurrentWeatherByCityIdResponse", targetNamespace = "http://current.forecast.snitsar.com/", className = "com.snitsar.forecast.current.GetCurrentWeatherByCityIdResponse")
    @Action(input = "http://current.forecast.snitsar.com/CurrentWeatherForOneLocation/getCurrentWeatherByCityIdRequest", output = "http://current.forecast.snitsar.com/CurrentWeatherForOneLocation/getCurrentWeatherByCityIdResponse")
    public WeatherResponse getCurrentWeatherByCityId(
        @WebParam(name = "cityId", targetNamespace = "")
        int cityId,
        @WebParam(name = "unit", targetNamespace = "")
        Units unit);

}
