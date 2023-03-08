public class Singleton {
    private static Singleton uniqueInstace = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
      if (uniqueInstace == null) {
        uniqueInstace = new Singleton();
      }
      return uniqueInstace;
    }
}
