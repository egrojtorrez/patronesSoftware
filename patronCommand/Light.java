public class Light {
  String name;

  public Light(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void on() {
    System.out.println("Light " + name + " is on");
  }

  public void off() {
    System.out.println("Light " + name + " is off");
  }
}