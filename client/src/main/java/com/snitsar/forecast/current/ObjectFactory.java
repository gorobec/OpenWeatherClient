
package com.snitsar.forecast.current;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.snitsar.forecast.current package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCurrentWeatherByGeographicCoordinates_QNAME = new QName("http://current.forecast.snitsar.com/", "getCurrentWeatherByGeographicCoordinates");
    private final static QName _GetCurrentWeatherByCityName_QNAME = new QName("http://current.forecast.snitsar.com/", "getCurrentWeatherByCityName");
    private final static QName _GetCurrentWeatherByCityNameWithCountyCode_QNAME = new QName("http://current.forecast.snitsar.com/", "getCurrentWeatherByCityNameWithCountyCode");
    private final static QName _GetCurrentWeatherByCityIdResponse_QNAME = new QName("http://current.forecast.snitsar.com/", "getCurrentWeatherByCityIdResponse");
    private final static QName _GetCurrentWeatherByCityNameWithCountyCodeResponse_QNAME = new QName("http://current.forecast.snitsar.com/", "getCurrentWeatherByCityNameWithCountyCodeResponse");
    private final static QName _GetCurrentWeatherByZipCode_QNAME = new QName("http://current.forecast.snitsar.com/", "getCurrentWeatherByZipCode");
    private final static QName _GetCurrentWeatherByCityNameResponse_QNAME = new QName("http://current.forecast.snitsar.com/", "getCurrentWeatherByCityNameResponse");
    private final static QName _GetCurrentWeatherByCityId_QNAME = new QName("http://current.forecast.snitsar.com/", "getCurrentWeatherByCityId");
    private final static QName _GetCurrentWeatherByZipCodeResponse_QNAME = new QName("http://current.forecast.snitsar.com/", "getCurrentWeatherByZipCodeResponse");
    private final static QName _GetCurrentWeatherByGeographicCoordinatesResponse_QNAME = new QName("http://current.forecast.snitsar.com/", "getCurrentWeatherByGeographicCoordinatesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.snitsar.forecast.current
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCurrentWeatherByCityNameWithCountyCode }
     * 
     */
    public GetCurrentWeatherByCityNameWithCountyCode createGetCurrentWeatherByCityNameWithCountyCode() {
        return new GetCurrentWeatherByCityNameWithCountyCode();
    }

    /**
     * Create an instance of {@link GetCurrentWeatherByGeographicCoordinates }
     * 
     */
    public GetCurrentWeatherByGeographicCoordinates createGetCurrentWeatherByGeographicCoordinates() {
        return new GetCurrentWeatherByGeographicCoordinates();
    }

    /**
     * Create an instance of {@link GetCurrentWeatherByCityName }
     * 
     */
    public GetCurrentWeatherByCityName createGetCurrentWeatherByCityName() {
        return new GetCurrentWeatherByCityName();
    }

    /**
     * Create an instance of {@link GetCurrentWeatherByCityIdResponse }
     * 
     */
    public GetCurrentWeatherByCityIdResponse createGetCurrentWeatherByCityIdResponse() {
        return new GetCurrentWeatherByCityIdResponse();
    }

    /**
     * Create an instance of {@link GetCurrentWeatherByCityNameResponse }
     * 
     */
    public GetCurrentWeatherByCityNameResponse createGetCurrentWeatherByCityNameResponse() {
        return new GetCurrentWeatherByCityNameResponse();
    }

    /**
     * Create an instance of {@link GetCurrentWeatherByCityId }
     * 
     */
    public GetCurrentWeatherByCityId createGetCurrentWeatherByCityId() {
        return new GetCurrentWeatherByCityId();
    }

    /**
     * Create an instance of {@link GetCurrentWeatherByCityNameWithCountyCodeResponse }
     * 
     */
    public GetCurrentWeatherByCityNameWithCountyCodeResponse createGetCurrentWeatherByCityNameWithCountyCodeResponse() {
        return new GetCurrentWeatherByCityNameWithCountyCodeResponse();
    }

    /**
     * Create an instance of {@link GetCurrentWeatherByZipCode }
     * 
     */
    public GetCurrentWeatherByZipCode createGetCurrentWeatherByZipCode() {
        return new GetCurrentWeatherByZipCode();
    }

    /**
     * Create an instance of {@link GetCurrentWeatherByGeographicCoordinatesResponse }
     * 
     */
    public GetCurrentWeatherByGeographicCoordinatesResponse createGetCurrentWeatherByGeographicCoordinatesResponse() {
        return new GetCurrentWeatherByGeographicCoordinatesResponse();
    }

    /**
     * Create an instance of {@link GetCurrentWeatherByZipCodeResponse }
     * 
     */
    public GetCurrentWeatherByZipCodeResponse createGetCurrentWeatherByZipCodeResponse() {
        return new GetCurrentWeatherByZipCodeResponse();
    }

    /**
     * Create an instance of {@link Rain }
     * 
     */
    public Rain createRain() {
        return new Rain();
    }

    /**
     * Create an instance of {@link WeatherResponse }
     * 
     */
    public WeatherResponse createWeatherResponse() {
        return new WeatherResponse();
    }

    /**
     * Create an instance of {@link Main }
     * 
     */
    public Main createMain() {
        return new Main();
    }

    /**
     * Create an instance of {@link Clouds }
     * 
     */
    public Clouds createClouds() {
        return new Clouds();
    }

    /**
     * Create an instance of {@link Sys }
     * 
     */
    public Sys createSys() {
        return new Sys();
    }

    /**
     * Create an instance of {@link Coord }
     * 
     */
    public Coord createCoord() {
        return new Coord();
    }

    /**
     * Create an instance of {@link Snow }
     * 
     */
    public Snow createSnow() {
        return new Snow();
    }

    /**
     * Create an instance of {@link Weather }
     * 
     */
    public Weather createWeather() {
        return new Weather();
    }

    /**
     * Create an instance of {@link Wind }
     * 
     */
    public Wind createWind() {
        return new Wind();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentWeatherByGeographicCoordinates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://current.forecast.snitsar.com/", name = "getCurrentWeatherByGeographicCoordinates")
    public JAXBElement<GetCurrentWeatherByGeographicCoordinates> createGetCurrentWeatherByGeographicCoordinates(GetCurrentWeatherByGeographicCoordinates value) {
        return new JAXBElement<GetCurrentWeatherByGeographicCoordinates>(_GetCurrentWeatherByGeographicCoordinates_QNAME, GetCurrentWeatherByGeographicCoordinates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentWeatherByCityName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://current.forecast.snitsar.com/", name = "getCurrentWeatherByCityName")
    public JAXBElement<GetCurrentWeatherByCityName> createGetCurrentWeatherByCityName(GetCurrentWeatherByCityName value) {
        return new JAXBElement<GetCurrentWeatherByCityName>(_GetCurrentWeatherByCityName_QNAME, GetCurrentWeatherByCityName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentWeatherByCityNameWithCountyCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://current.forecast.snitsar.com/", name = "getCurrentWeatherByCityNameWithCountyCode")
    public JAXBElement<GetCurrentWeatherByCityNameWithCountyCode> createGetCurrentWeatherByCityNameWithCountyCode(GetCurrentWeatherByCityNameWithCountyCode value) {
        return new JAXBElement<GetCurrentWeatherByCityNameWithCountyCode>(_GetCurrentWeatherByCityNameWithCountyCode_QNAME, GetCurrentWeatherByCityNameWithCountyCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentWeatherByCityIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://current.forecast.snitsar.com/", name = "getCurrentWeatherByCityIdResponse")
    public JAXBElement<GetCurrentWeatherByCityIdResponse> createGetCurrentWeatherByCityIdResponse(GetCurrentWeatherByCityIdResponse value) {
        return new JAXBElement<GetCurrentWeatherByCityIdResponse>(_GetCurrentWeatherByCityIdResponse_QNAME, GetCurrentWeatherByCityIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentWeatherByCityNameWithCountyCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://current.forecast.snitsar.com/", name = "getCurrentWeatherByCityNameWithCountyCodeResponse")
    public JAXBElement<GetCurrentWeatherByCityNameWithCountyCodeResponse> createGetCurrentWeatherByCityNameWithCountyCodeResponse(GetCurrentWeatherByCityNameWithCountyCodeResponse value) {
        return new JAXBElement<GetCurrentWeatherByCityNameWithCountyCodeResponse>(_GetCurrentWeatherByCityNameWithCountyCodeResponse_QNAME, GetCurrentWeatherByCityNameWithCountyCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentWeatherByZipCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://current.forecast.snitsar.com/", name = "getCurrentWeatherByZipCode")
    public JAXBElement<GetCurrentWeatherByZipCode> createGetCurrentWeatherByZipCode(GetCurrentWeatherByZipCode value) {
        return new JAXBElement<GetCurrentWeatherByZipCode>(_GetCurrentWeatherByZipCode_QNAME, GetCurrentWeatherByZipCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentWeatherByCityNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://current.forecast.snitsar.com/", name = "getCurrentWeatherByCityNameResponse")
    public JAXBElement<GetCurrentWeatherByCityNameResponse> createGetCurrentWeatherByCityNameResponse(GetCurrentWeatherByCityNameResponse value) {
        return new JAXBElement<GetCurrentWeatherByCityNameResponse>(_GetCurrentWeatherByCityNameResponse_QNAME, GetCurrentWeatherByCityNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentWeatherByCityId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://current.forecast.snitsar.com/", name = "getCurrentWeatherByCityId")
    public JAXBElement<GetCurrentWeatherByCityId> createGetCurrentWeatherByCityId(GetCurrentWeatherByCityId value) {
        return new JAXBElement<GetCurrentWeatherByCityId>(_GetCurrentWeatherByCityId_QNAME, GetCurrentWeatherByCityId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentWeatherByZipCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://current.forecast.snitsar.com/", name = "getCurrentWeatherByZipCodeResponse")
    public JAXBElement<GetCurrentWeatherByZipCodeResponse> createGetCurrentWeatherByZipCodeResponse(GetCurrentWeatherByZipCodeResponse value) {
        return new JAXBElement<GetCurrentWeatherByZipCodeResponse>(_GetCurrentWeatherByZipCodeResponse_QNAME, GetCurrentWeatherByZipCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentWeatherByGeographicCoordinatesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://current.forecast.snitsar.com/", name = "getCurrentWeatherByGeographicCoordinatesResponse")
    public JAXBElement<GetCurrentWeatherByGeographicCoordinatesResponse> createGetCurrentWeatherByGeographicCoordinatesResponse(GetCurrentWeatherByGeographicCoordinatesResponse value) {
        return new JAXBElement<GetCurrentWeatherByGeographicCoordinatesResponse>(_GetCurrentWeatherByGeographicCoordinatesResponse_QNAME, GetCurrentWeatherByGeographicCoordinatesResponse.class, null, value);
    }

}
