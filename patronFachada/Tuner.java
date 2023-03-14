public class Tuner{
  Amplifier amplifier;
  public Tuner(){
  }
  public void on(){
    System.out.println("Tuner on");
  }
  public void off(){
    System.out.println("Tuner off");
  }
  public void setAm(){
    System.out.println("Tuner setAm");
  }
  public void setFm(){
    System.out.println("Tuner setFm");
  }
  public void setFrequency(double frequency){
    System.out.println("Tuner setFrequency " + frequency);
  }
}