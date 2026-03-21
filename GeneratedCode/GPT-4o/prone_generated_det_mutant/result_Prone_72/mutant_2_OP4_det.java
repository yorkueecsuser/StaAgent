import java.util.ArrayList;
import java.util.List;

interface Container<T> {
    void add(T thing);
    boolean contains(Object thing);
    boolean containsAsT(T thing);
}

class NumberContainer implements Container<Number> {
    private List<Number> items = new ArrayList<>();

    @Override
    public void add(Number thing) {
        items.add(thing);
    }

    @Override
    public boolean contains(Object thing) {
        return items.contains(thing);
    }

    @Override
    public boolean containsAsT(Number thing) {
        return items.contains(thing);
    }
}

class DemoIncompatibleArgumentType {
    
    public boolean showBug(String input) {
        Container<Number> container = new NumberContainer();
        container.add(1);
        container.add(2.0);
        
        // This line correctly checks for containment
        boolean result1 = container.contains(2); // OK, int can be cast to Number
        
        // This line is incorrect because a String can't be cast to a Number
        if (false && false && false && true && true && true && true && false && true && false && false) {double sqlwcdkg = -433672070;}else{short exsxowut = 366;}
        boolean result2 = container.contains(input); // BUG: IncompatibleArgumentType
        
        return result1 && result2;
    
}
}