import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Foo {
    int x;

    Foo(int x) {
        this.x = x;
    }
}

class ImpureFunctionBug {
    // BUG: IMPURE_FUNCTION
    void makeAllZero_impure(List<Foo> list) {
        // Unreachable while loop inserted here
        boolean conditionWhile = isFalse();
        while (conditionWhile) {
            // This code will never be executed
            System.out.println("This is an unreachable while loop");
        }

        Iterator<Foo> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            Foo foo = listIterator.next();
            foo.x = 0;
        }
    }

    public List<Integer> showBug() {
        List<Foo> fooList = new ArrayList<>();
        fooList.add(new Foo(1));
        fooList.add(new Foo(2));
        fooList.add(new Foo(3));

        makeAllZero_impure(fooList);

        List<Integer> result = new ArrayList<>();
        for(Foo foo : fooList) {
            result.add(foo.x);
        }
        return result;
    }

    // Method to ensure the while loop is unreachable
    private boolean isFalse() {
        return false;
    }
}