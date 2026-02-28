
import java.util.List;

class Laptop {}
class Fruit {}

class Pear extends Laptop {}

class PearFood extends Fruit {}

class Store {

  public boolean hasSellByDate(Object item) {
    if ("Pear".equals(item.getClass().getSimpleName())) {  // BUG: Classes should not be compared by name
      return true;  // Results in throwing away week-old computers
    }
    return false;
  }

  public boolean isList(Class<?> valueClass) {
    if (List.class.getName().equals(valueClass.getName())) {  // BUG: Classes should not be compared by name
      return true;
    }
    return false;
  }

  public void showBug() {
    Pear computerPear = new Pear();
    PearFood foodPear = new PearFood();
    System.out.println("Checking computer.Pear: " + hasSellByDate(computerPear)); // This should be false logically but returns true due to the bug
    System.out.println("Checking food.Pear: " + hasSellByDate(foodPear)); // This should be true logically and returns true
    System.out.println("Checking if it's a List: " + isList(List.class)); // This should be true
  }
}

class BugDemonstration {
  public static void main(String[] args) {
    Store store = new Store();
    store.showBug();
  }
}