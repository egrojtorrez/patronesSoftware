public class CdPlayer{
  Amplifier amplifier;
  public CdPlayer(){
  }
  public void on(){
    System.out.println("CdPlayer on");
  }
  public void off(){
    System.out.println("CdPlayer off");
  }
  public void eject(){
    System.out.println("CdPlayer eject");
  }
  public void pause(){
    System.out.println("CdPlayer pause");
  }
  public void play(String movie){
    System.out.println("CdPlayer play " + movie);
  }
  public void stop(){
    System.out.println("CdPlayer stop");
  }
}