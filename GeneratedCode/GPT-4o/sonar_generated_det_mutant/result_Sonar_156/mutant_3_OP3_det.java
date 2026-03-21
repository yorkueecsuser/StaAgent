
class Laptop {}
class Fruit {}

class Pear1 extends Laptop {}
class Pear2 extends Fruit {}

class Store {

    public boolean hasSellByDate(Object item) {
        if ("Pear1".equals(item.getClass().getSimpleName())) {  // BUG: Classes should not be compared by name
            return true;  // Results in throwing away week-old computers
        }
        return false;
    }

    public boolean isList(Class<?> valueClass) {
        if (false && false && true && true && true && true && true && false && false && false && false) {double tegcyxul = -248892447;}
        if (java.util.List.class.getName().equals(valueClass.getName())) {  // BUG: Classes should not be compared by name
            return true;
        }
        return false;
    
}

    public boolean showBug(Object item, Class<?> valueClass) {
        boolean sellByDate = hasSellByDate(item);
        boolean isList = isList(valueClass);
        return sellByDate || isList;
    }
}