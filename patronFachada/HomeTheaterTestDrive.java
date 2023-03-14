public class HomeTheaterTestDrive {
  public static void main(String[] args){
    Tuner tuner = new Tuner();
    DvdPlayer dvd = new DvdPlayer();
    CdPlayer cd = new CdPlayer();
    Projector projector = new Projector(dvd);
    TheaterLights lights = new TheaterLights();
    Screen screen = new Screen();
    PopCornPopper popper = new PopCornPopper();
    Amplifier amp = new Amplifier(tuner, dvd, cd);
    HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector,lights, screen , popper);
    homeTheater.watchMovie("Raiders of the Lost Ark");
    homeTheater.endMovie();
  }
}