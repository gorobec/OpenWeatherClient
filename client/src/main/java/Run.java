import com.snitsar.forecast.current.CurrentWeatherForOneLocation;
import com.snitsar.forecast.current.CurrentWeatherForOneLocationService;
import com.snitsar.forecast.current.Units;
import com.snitsar.forecast.current.WeatherResponse;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class Run {
    public static void main(String[] args) {
        CurrentWeatherForOneLocation service = new CurrentWeatherForOneLocationService().getCurrentWeatherForOneLocationPort();
        WeatherResponse response = service.getCurrentWeatherByCityName("kiev", Units.METRIC);
        System.out.println(response);
    }
}
