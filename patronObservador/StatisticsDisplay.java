public class StatisticsDisplay implements Observer, DisplayElement {
    private float min = 0;
    private float max = 0;
    private float media = 0;
  
    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }
  
    public void update(float temperature, float humidity, float pressure) {
        if (max == 0 && min == 0 && media == 0) {
            max = temperature;
            min = temperature;
        }else if (temperature > max) {
            max = temperature;
        }else if (temperature < min) {
            min = temperature;
        }
        media = (max + min) / 2;
        display();
    }
  
    public void display() {
        System.out.println("Avg/Max/Min: " + media + "/" + max + "/" + min);
    }
}
