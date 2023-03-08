// Jorge Omar Torres Sosa - 1270900
public class PizzaTestDrive {
  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();
    PizzaStore californiaStore = new CaliforniaPizzaStore();
 
    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");

    pizza = chicagoStore.orderPizza("cheese");
    System.out.println("Joel ordered a " + pizza.getName() + "\n");

    pizza = californiaStore.orderPizza("cheese");
    System.out.println("Jorge ordered a " + pizza.getName() + "\n");

  }
}
