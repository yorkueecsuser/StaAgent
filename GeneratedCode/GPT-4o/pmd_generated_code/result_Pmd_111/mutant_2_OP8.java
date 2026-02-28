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
        return fooArray;
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

// Mutated code
class CollectionToArrayBugMutant {

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
        Foo[] a = foos.toArray(new Foo[foos.size()]); // Renamed variable: fooArray to a
        return a;
    }

    public static void main(String[] args) {
        List<Foo> b = new ArrayList<>(); // Renamed variable: fooList to b
        b.add(new Foo("Foo1"));
        b.add(new Foo("Foo2"));
        b.add(new Foo("Foo3"));

        Foo[] c = showBug(b); // Renamed variable: fooArray to c
        for (Foo foo : c) {
            System.out.println(foo.getName());
        }
    }
}