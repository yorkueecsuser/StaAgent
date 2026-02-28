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

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition(); // ensure condition is dynamically determined
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable
            System.out.println("This is an unreachable loop");
        }

        return fooArray;
    }

    // Helper method to provide a runtime condition
    public static boolean getCondition() {
        return false; // This will make the loop condition always false at runtime
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