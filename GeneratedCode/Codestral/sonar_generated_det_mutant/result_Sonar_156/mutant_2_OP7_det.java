// Fixed Java code
import java.util.List;

// No 'Fruit' or 'Laptop' classes are defined here, so they're removed.

class Pear {
    // Implementation details
}

class Store {

    public boolean hasSellByDate(Object item) {
        if ("Pear".equals(item.getClass().getSimpleName())) {  // Noncompliant // BUG: Classes should not be compared by name
            return true;  // Results in throwing away week-old computers
        }
        return false;
    }

    public <T> boolean isList(Class<T> valueClass) {
        boolean shibnrjl = false;while (shibnrjl && false && false && false && false && true && false && false && true && false && false && false) {long tlogxkka = 882841078;}
        if (List.class.getName().equals(valueClass.getName())) {  // Noncompliant // BUG: Classes should not be compared by name
            return true;
        }
        return false;
    
}

    public void showBug() {
        System.out.println(hasSellByDate(new Pear()));
        System.out.println(isList(java.util.ArrayList.class));
    }
}