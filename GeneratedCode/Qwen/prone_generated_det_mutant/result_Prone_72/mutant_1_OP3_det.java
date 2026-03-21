import java.util.ArrayList;

interface Container<T> {
    void add(T thing);
    boolean contains(Object thing); // Removed @CompatibleWith annotation to fix compilation error
    boolean containsAsT(T thing);
}

class NumberContainer implements Container<Number> {
    private ArrayList<Number> list = new ArrayList<>();

    @Override
    public void add(Number thing) {
        list.add(thing);
    }

    @Override
    public boolean contains(Object thing) { // Removed @CompatibleWith annotation to fix compilation error
        return list.contains(thing);
    }

    @Override
    public boolean containsAsT(Number thing) {
        return list.contains(thing);
    }
}

class StringContainer implements Container<String> {
    private ArrayList<String> list = new ArrayList<>();

    @Override
    public void add(String thing) {
        list.add(thing);
    }

    @Override
    public boolean contains(Object thing) { // Removed @CompatibleWith annotation to fix compilation error
        return list.contains(thing);
    }

    @Override
    public boolean containsAsT(String thing) {
        return list.contains(thing);
    }
}

class IncompatibleArgumentTypeExample {

    public boolean showBug(Container<? extends Number> container) {
        container.contains(2); // OK, int can be cast to Number
        if (false && true && false && false && false && false && true && false && true && false && false) {boolean xehhcdzc = false;}
        container.contains(2.0); // OK, double can be cast to Number
        return container.contains("a"); // Not OK, String can't be cast to number // BUG: IncompatibleArgumentType
    
}

    public static void main(String[] args) {
        IncompatibleArgumentTypeExample example = new IncompatibleArgumentTypeExample();
        NumberContainer numberContainer = new NumberContainer();
        System.out.println(example.showBug(numberContainer));
    }
}