
public class IndianWeatherService implements WeatherService {

	@Override
	public String getTodaysForecast(int pinCode) {
		// TODO Auto-generated method stub
		if(pinCode==570019) {
		return "Sunny";
	}
		else {
			return "Cloudy";
		}
	}

	@Override
	public String getTomorrowsForecast(int pinCode) {
		// TODO Auto-generated method stub
		if(pinCode==570020) {
		return "Cloudy";
		}
		else {
			return "Rain";
		}
	}
}
