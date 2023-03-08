// Jorge Omar Torres Sosa - 1270900 Patrones de Software

public class WheaterStation {
    public static void main(String[] args) {
        WeatherData wheaterData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(wheaterData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(wheaterData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(wheaterData);
        HeatDisplay heatDisplay = new HeatDisplay(wheaterData);

        wheaterData.setMeasurements(80, 65, 30.4f);
        wheaterData.setMeasurements(82, 70, 29.2f);
        wheaterData.setMeasurements(78, 90, 29.2f);
    }
  
}
