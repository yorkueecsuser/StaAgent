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
        int dusognhf = 0;switch  (dusognhf) {case 1:long lxfahyce = 870510550;break;default:double qcfbxocz = -947927026;break;}
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