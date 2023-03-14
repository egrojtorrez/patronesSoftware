public class Amplifier{
  Tuner tuner;
  DvdPlayer dvdPlayer;
  CdPlayer cdPlayer;
  int volume;
  public Amplifier(Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer){
    this.tuner = tuner;
    this.dvdPlayer = dvdPlayer;
    this.cdPlayer = cdPlayer;
  }
  public void on(){
    System.out.println("Amplifier on");
  }
  public void off(){
    System.out.println("Amplifier off");
  }
  public void setStereoSound(){
    System.out.println("Amplifier setStereoSound");
  }
  public void setSurroundSound(){
    System.out.println("Amplifier setSurroundSound");
  }
  public void setVolume(int volume){
    this.volume = volume;
    System.out.println("Amplifier setVolume");
  }
  public void setTuner(Tuner tuner){
    this.tuner = tuner;
    System.out.println("Amplifier setTuner");
  }
  public void setDvd(DvdPlayer dvdPlayer){
    this.dvdPlayer = dvdPlayer;
    System.out.println("Amplifier setDvd");
  }
  public void setCd(CdPlayer cdPlayer){
    this.cdPlayer = cdPlayer;
    System.out.println("Amplifier setCd");
  }
}