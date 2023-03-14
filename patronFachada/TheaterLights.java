public class TheaterLights{
  int level;
  public TheaterLights(){
  }
  public void on(){
    System.out.println("TheaterLights on");
  }
  public void off(){
    System.out.println("TheaterLights off");
  }
  public void dim(int level){
    this.level = level;
    System.out.println("TheaterLights dimming to " + level + "%");
  }
}