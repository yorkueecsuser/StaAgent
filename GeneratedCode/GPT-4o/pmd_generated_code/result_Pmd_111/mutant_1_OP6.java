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

        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is unreachable code inside the for loop");
        }

        return fooArray;
    }

    // This method provides a dynamic condition for the unreachable loop
    private static boolean getCondition() {
        return false;
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