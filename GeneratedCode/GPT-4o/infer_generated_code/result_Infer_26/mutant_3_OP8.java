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
    }

    public List<Foo> showBug(List<Foo> inputList) {
        makeAllZero_impure(inputList);
        return inputList;
    }

    // Mutant Code Begins
    public void makeAllZero_impure_b(List<Foo> a) {
        Iterator<Foo> b = a.iterator();
        while (b.hasNext()) {
            Foo c = b.next();
            c.x = 0; // BUG: IMPURE_FUNCTION
        }
    }

    public List<Foo> showBug_b(List<Foo> a) {
        makeAllZero_impure_b(a);
        return a;
    }
    // Mutant Code Ends

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

        // Testing the mutant code
        List<Foo> fooList_b = new ArrayList<>();
        fooList_b.add(new Foo(1));
        fooList_b.add(new Foo(2));
        fooList_b.add(new Foo(3));

        List<Foo> resultList_b = example.showBug_b(fooList_b);

        for (Foo foo : resultList_b) {
            System.out.println(foo.x);  // All elements should be zero due to the impure function
        }
    }
}