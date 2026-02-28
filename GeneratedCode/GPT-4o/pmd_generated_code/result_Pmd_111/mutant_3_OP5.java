import java.util.ArrayList;
import java.util.List;

class CollectionToArrayBug {

    public static class Foo {
        private String name;

        public Foo(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static Foo[] showBug(List<Foo> foos) {
        // Inefficient use of toArray with pre-sized array
        Foo[] fooArray = foos.toArray(new Foo[foos.size()]); // BUG: OptimizableToArrayCall

        // Unreachable switch statement
        int unreachableValue = getValue();
        switch (unreachableValue) {
            case 999: // Assumed unreachable
                System.out.println("This switch case is unreachable.");
                break;
            default:
                // Default case does nothing
                break;
        }
        
        return fooArray;
    }

    public static int getValue() {
        return -1; // Always returns -1, making the switch case 999 unreachable
    }

    public static void main(String[] args) {
        List<Foo> fooList = new ArrayList<>();
        fooList.add(new Foo("Foo1"));
        fooList.add(new Foo("Foo2"));
        fooList.add(new Foo("Foo3"));

        Foo[] fooArray = showBug(fooList);
        for (Foo foo : fooArray) {
            System.out.println(foo.getName());
        }
    }
}