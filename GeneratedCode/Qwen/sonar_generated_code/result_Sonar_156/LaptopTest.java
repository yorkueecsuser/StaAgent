import org.junit.Test;
import static org.junit.Assert.*;

class Laptop {}

class food_Pear extends Laptop {}  // Renamed to avoid conflict

class Fruit {}

class computer_Pear extends Fruit {}  // Renamed to avoid conflict

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

  public boolean showBug1(food_Pear foodPear) {
    return hasSellByDate(foodPear);
  }

  public boolean showBug2(computer_Pear computerPear) {
    return hasSellByDate(computerPear);
  }

  public boolean showBug3(Class<?> listClass) {
    return isList(listClass);
  }

  public boolean showBug(food_Pear foodPear, computer_Pear computerPear, Class<?> listClass) {
    return showBug1(foodPear) || showBug2(computerPear) || showBug3(listClass);
  }
}

public class StoreTest {

    @Test
    public void testHasSellByDateWithFoodPear() {
        food_Pear foodPear = new food_Pear();
        assertFalse(new Store().showBug(foodPear, null, null)); // TRIGGER BUG: Classes should not be compared by name
    }

    @Test
    public void testHasSellByDateWithComputerPear() {
        computer_Pear computerPear = new computer_Pear();
        assertTrue(new Store().showBug(null, computerPear, null)); // TRIGGER BUG: Classes should not be compared by name
    }

    @Test
    public void testIsListWithArrayList() {
        Class<?> arrayListClass = java.util.ArrayList.class;
        assertTrue(new Store().showBug(null, null, arrayListClass)); // TRIGGER BUG: Classes should not be compared by name
    }

    @Test
    public void testIsListWithLinkedList() {
        Class<?> linkedListClass = java.util.LinkedList.class;
        assertFalse(new Store().showBug(null, null, linkedListClass)); // TRIGGER BUG: Classes should not be compared by name
    }
}