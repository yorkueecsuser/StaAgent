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
        // Unreachable while loop mutant
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This code is never executed
            System.out.println("This is unreachable code");
        }
        
        // Inefficient use of toArray with pre-sized array
        Foo[] fooArray = foos.toArray(new Foo[foos.size()]); // BUG: OptimizableToArrayCall
        return fooArray;
    }
    
    private static boolean getUnreachableCondition() {
        return false; // This method call ensures the condition is evaluated at runtime
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