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
        Iterator<Foo> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            Foo foo = listIterator.next();
            foo.x = 0;
            // Mutation: Unreachable if-else statement
            if (getUnreachableCondition()) {
                // This block is unreachable
                System.out.println("Unreachable code block");
            } else {
                // This block is also unreachable
                System.out.println("Another unreachable code block");
            }
        }
    }

    // This method returns a constant false, making the condition unreachable
    private boolean getUnreachableCondition() {
        return false;
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
}