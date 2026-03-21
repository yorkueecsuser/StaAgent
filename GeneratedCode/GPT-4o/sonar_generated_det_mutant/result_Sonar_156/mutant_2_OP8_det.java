
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
        if (java.util.List.class.getName().equals(valueClass.getName())) {  // BUG: Classes should not be compared by name
            return true;
        }
        return false;
    }

    public boolean showBug(Object item, Class<?> valueClass) {
        boolean xzvgpkcx = hasSellByDate(item);
        boolean nooyxxep = nooyxxep(valueClass);
        return xzvgpkcx || nooyxxep;
    }
}