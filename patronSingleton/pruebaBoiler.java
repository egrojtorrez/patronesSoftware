public class pruebaBoiler {
  public static void main(String[] args) {
    ChocolateBoiler boiler = ChocolateBoiler.getInstance();
    ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();

    boiler.fill();
    boiler2.fill();

    boiler2.boil();
    boiler.boil();
    
    boiler.drain();
    boiler2.drain();
    
  }
  
}
