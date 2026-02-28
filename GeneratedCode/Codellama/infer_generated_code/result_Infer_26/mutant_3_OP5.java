import java.util.ArrayList;
import java.util.Iterator;

class ImpureFunction {
    public static void main(String[] args) {
        ArrayList<Foo> list = new ArrayList<>();
        list.add(new Foo(1));
        list.add(new Foo(2));
        list.add(new Foo(3));

        makeAllZero_impure(list);

        for (Foo foo : list) {
            System.out.println(foo.x);
        }
    }

    static void makeAllZero_impure(ArrayList<Foo> list) {
        Iterator<Foo> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            Foo foo = listIterator.next();
            foo.x = 0;
        }
    }
}

class Foo {
    int x;

    Foo(int x) {
        this.x = x;
    }
}

// Mutation Operator: Unreachable switch statement
// Description: Inserting an unreachable switch statement into a randomly selected basic block in the program.
// The switch condition must always evaluate to false to make it unreachable.

// Mutated code:

switch (false) {
    case 1:
        System.out.println("Reachable code");
        break;
    default:
        System.out.println("Unreachable code");
        break;
}