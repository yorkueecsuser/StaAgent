import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Marker annotation used for static analysis.
 */
@interface Mutable {}

class Foo {
    int x;

    Foo(int x) {
        this.x = x;
    }
}

class ImpureFunctionExample {

    @Mutable
    public void makeAllZero_impure(List<Foo> list) {
        Iterator<Foo> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            Foo foo = listIterator.next();
            foo.x = 0; // BUG: IMPURE_FUNCTION
        }

        // Inserting an unreachable while loop with a non-final false condition
        boolean alwaysFalse = computeAlwaysFalse();
        while (alwaysFalse) {
            System.out.println("This will never print.");
        }
    }

    // Method to provide a false condition for the unreachable while loop
    private boolean computeAlwaysFalse() {
        return false;
    }

    public List<Foo> showBug(List<Foo> inputList) {
        makeAllZero_impure(inputList);
        return inputList;
    }

    public static void main(String[] args) {
        List<Foo> fooList = new ArrayList<>();
        fooList.add(new Foo(1));
        fooList.add(new Foo(2));
        fooList.add(new Foo(3));

        ImpureFunctionExample example = new ImpureFunctionExample();
        List<Foo> resultList = example.showBug(fooList);

        for (Foo foo : resultList) {
            System.out.println(foo.x);  // All elements should be zero due to the impure function
        }
    }
}