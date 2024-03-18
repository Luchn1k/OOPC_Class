abstract class DrinkMachine {
    abstract void setDrink();

    public final void boilWater() {
        System.out.println("boil water");
    }

    abstract void addDrinkType();

    abstract void addExtra();

    public void pour() {
        System.out.println("pour");
    }

    public final void createDrink() {
        setDrink();
        boilWater();
        addDrinkType();
        addExtra();
        pour();
    }
}
