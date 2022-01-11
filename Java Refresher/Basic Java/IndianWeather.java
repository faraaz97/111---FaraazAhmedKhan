
public class IndianWeather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndianWeatherService iws=new IndianWeatherService();
		System.out.println(iws.getTodaysForecast(570019));
		
		System.out.println(iws.getTomorrowsForecast(570020));

	}

}
