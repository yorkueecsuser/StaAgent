import org.junit.Test;
import static org.junit.Assert.*;

class Laptop {}

class Pear extends Laptop {
    // This is a computer Pear
}

class Fruit {}

class food_Pear extends Fruit {
    // This is a food Pear
}

class Store {

    public boolean hasSellByDate(Object item) {
        if ("Pear".equals(item.getClass().getSimpleName())) {  // TRIGGER BUG: Classes should not be compared by name
            return true;  // Results in throwing away week-old computers
        }
        return false;
    }

    public boolean isList(Class<?> valueClass) {
        if (List.class.getName().equals(valueClass.getName())) {  // TRIGGER BUG: Classes should not be compared by name
            return true;
        }
        return false;
    }

    public boolean showBug(Object item) {
        return hasSellByDate(item);
    }

    public boolean showBug1(Class<?> valueClass) {
        return isList(valueClass);
    }
}

public class StoreTest {

    @Test
    public void testHasSellByDateWithComputerPear() {
        Store store = new Store();
        Pear computerPear = new Pear();
        assertFalse(store.showBug(computerPear)); // TRIGGER BUG: Classes should not be compared by name
    }

    @Test
    public void testHasSellByDateWithFoodPear() {
        Store store = new Store();
        food_Pear foodPear = new food_Pear();
        assertFalse(store.showBug(foodPear)); // TRIGGER BUG: Classes should not be compared by name
    }

    @Test
    public void testIsListWithListClass() {
        Store store = new Store();
        assertTrue(store.showBug1(java.util.List.class)); // TRIGGER BUG: Classes should not be compared by name
    }

    @Test
    public void testIsListWithStringClass() {
        Store store = new Store();
        assertFalse(store.showBug1(String.class)); // TRIGGER BUG: Classes should not be compared by name
    }
}