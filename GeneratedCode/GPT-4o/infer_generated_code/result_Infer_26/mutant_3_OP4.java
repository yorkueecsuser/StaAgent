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

            // Inserted unreachable if-else branch
            boolean condition = getFalseCondition(); // This condition is always false
            if (condition) {
                // This block is unreachable
                System.out.println("Unreachable if statement executed");
            } else {
                // This is the reachable else block
                System.out.println("Else block executed");
            }
        }
    }
    
    // This method returns false, making the if condition unreachable
    private boolean getFalseCondition() {
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