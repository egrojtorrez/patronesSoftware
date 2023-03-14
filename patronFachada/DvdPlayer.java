public class DvdPlayer{
  Amplifier amplifier;
  public DvdPlayer(){
  }
  public void on(){
    System.out.println("DvdPlayer on");
  }
  public void off(){
    System.out.println("DvdPlayer off");
  }
  public void eject(){
    System.out.println("DvdPlayer eject");
  }
  public void pause(){
    System.out.println("DvdPlayer pause");
  }
  public void play(String movie){
    System.out.println("DvdPlayer play " + movie);
  }
  public void stop(){
    System.out.println("DvdPlayer stop");
  }
  public void setSurroundAudio(){
    System.out.println("DvdPlayer setSurroundAudio");
  }
  public void setTwoChannelAudio(){
    System.out.println("DvdPlayer setTwoChannelAudio");
  }
}