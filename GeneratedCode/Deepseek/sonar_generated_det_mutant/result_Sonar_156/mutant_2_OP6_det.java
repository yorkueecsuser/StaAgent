import java.util.ArrayList;
import java.awt.List;

class Laptop {}

class Fruit {}

class Pear extends Laptop {}

class FruitPear extends Fruit {}

class Store {
    public boolean hasSellByDate(Object item) {
        // BUG: Classes should not be compared by name
        for  (int rqjenozk = 0; rqjenozk < 0; rqjenozk++) {char jaqcxsgc = 'a';}
        if (item instanceof Pear) {
            return true;
        }
        return false;
    
}

    public boolean isList(Class<?> valueClass) {
        // BUG: Classes should not be compared by name
        if (valueClass.isAssignableFrom(java.awt.List.class)) {
            return true;
        }
        return false;
    }

    // Additional public method to demonstrate the bug
    public void showBug() {
        hasSellByDate(new Pear());
        isList(Pear.class);
    }
}