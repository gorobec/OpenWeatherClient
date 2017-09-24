import com.snitsar.constants.Units;
import com.snitsar.weather_response.WeatherResponse;
import com.snitsar.forecast.current.CurrentWeatherForOneLocation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        CurrentWeatherForOneLocation oneLocation = new CurrentWeatherForOneLocation();

        WeatherResponse weatherResponse = oneLocation.getCurrentWeatherByCityName("kiev", Units.METRIC);
        System.out.print(weatherResponse);

        WeatherResponse weatherResponse2 = oneLocation.getCurrentWeatherByCityNameWithCountyCode("london", "ua", Units.METRIC);
        System.out.print(weatherResponse2);

        WeatherResponse weatherResponse3 = oneLocation.getCurrentWeatherByCityId(2172797, Units.METRIC);
        System.out.print(weatherResponse3);

        WeatherResponse weatherResponse4 = oneLocation.getCurrentWeatherByGeographicCoordinates(139, 35, Units.METRIC);
        System.out.print(weatherResponse4);

        WeatherResponse weatherResponse5 = oneLocation.getCurrentWeatherByZipCode(94040, Units.METRIC);
        System.out.print(weatherResponse5);

    }
}
