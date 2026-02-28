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
    void makeAllZero_impure(List<Foo> list) {
        Iterator<Foo> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            Foo foo = listIterator.next();
            // Mutant Code (Unreachable switch statement)
            if (getUnreachableCondition()) {
                switch (0) {
                    case 1:
                        System.out.println("Unreachable code");
                        break;
                }
            }
            foo.x = 0;
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    // Rest of the code remains unchanged
}