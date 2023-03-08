// Jorge Omar Torres Sosa - 1270900

public class PizzaTestDrive {
  public static void main(String[] args) {
    PizzaStore nyPizzaStore = new NYPizzaStore();
    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
    PizzaStore californiaPizzaStore = new CaliforniaPizzaStore();

    nyPizzaStore.orderPizza("cheese");
    System.out.println(" --- ");
    chicagoPizzaStore.orderPizza("veggie");
    System.out.println(" --- ");
    californiaPizzaStore.orderPizza("clam");
  } 
}