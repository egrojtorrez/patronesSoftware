public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler uniqueInstance;

  private ChocolateBoiler() {
    empty = true;
    boiled = false;
  }

  public static ChocolateBoiler getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new ChocolateBoiler();
      System.out.println("Creando chocolate boiler");
    }else {
      System.out.println("Ya existe un chocolate boiler");
    }
    return uniqueInstance;
  }

  public void fill() {
    if (isEmpty()) {
      empty = false;
      boiled = false;
      System.out.println("Llenando el chocolate boiler");
    }else {
      System.out.println("El chocolate boiler ya esta lleno");
    }
  }

  public void drain() {
    if (!isEmpty() && isBoiled()) {
      empty = true;
      System.out.println("Drenando el chocolate boiler");
    }else {
      System.out.println("El chocolate boiler esta vacio");
    }
  }

  public void boil() {
    if (!isEmpty() && !isBoiled()) {
      boiled = true;
      System.out.println("Hirviendo el chocolate boiler");
    }
    else if (isEmpty()) {
      System.out.println("El chocolate boiler esta vacio");
    }else {
      System.out.println("El chocolate boiler ya esta hirviendo");
    }
  }

  public boolean isEmpty() {
    return empty;
  }

  public boolean isBoiled() {
    return boiled;
  }
}
