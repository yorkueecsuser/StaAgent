import java.util.List;

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
        for  (int wtdklmks = 0; wtdklmks < 0; wtdklmks++) {boolean vhqjibut = false;}
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

    public boolean showBug(Object item) {
        return hasSellByDate(item);
    }

    public boolean showBug1(Class<?> valueClass) {
        return isList(valueClass);
    }
}

class BugDemonstration {
    public static void main(String[] args) {
        Store store = new Store();
        Pear computerPear = new Pear();
        food_Pear foodPear = new food_Pear();

        System.out.println("Computer Pear has sell-by date: " + store.showBug(computerPear)); // Should be false
        System.out.println("Food Pear has sell-by date: " + store.showBug(foodPear)); // Should be false but will be true due to bug

        System.out.println("Is List class: " + store.showBug1(List.class)); // Should be true
        System.out.println("Is String class: " + store.showBug1(String.class)); // Should be false
    }
}