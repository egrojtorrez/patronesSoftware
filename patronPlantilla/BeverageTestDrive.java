public class BeverageTestDrive {
    public static void main(String[] args) {
        CoffeWithHook coffeWithHook = new CoffeWithHook();
        TeaWithHook teaWithHook = new TeaWithHook();
        System.out.println("Making coffe...");
        coffeWithHook.prepareRecipe();
        System.out.println("Making tea...");
        teaWithHook.prepareRecipe();
    }
}
