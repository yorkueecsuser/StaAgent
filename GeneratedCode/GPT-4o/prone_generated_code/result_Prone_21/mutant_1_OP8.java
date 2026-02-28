import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Foo implements Comparable<Bar> { // BUG: ComparableType
    private int value;

    public Foo(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Bar other) { // BUG: ComparableType
        return Integer.compare(this.value, other.getValue());
    }

    public int getValue() {
        return value;
    }
}

class Bar {
    private int value;

    public Bar(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class BugDemo {
    public List<Foo> showBug(List<Foo> fooList, List<Bar> barList) {
        // This will cause a ClassCastException because Foo is not comparable to Bar in this context
        Collections.sort((List) fooList); // Explicit cast to avoid compilation error
        return fooList;
    }

    public static void main(String[] args) {
        List<Foo> fooList = new ArrayList<>();
        fooList.add(new Foo(3));
        fooList.add(new Foo(1));
        fooList.add(new Foo(2));

        List<Bar> barList = new ArrayList<>();
        barList.add(new Bar(3));
        barList.add(new Bar(1));
        barList.add(new Bar(2));

        BugDemo demo = new BugDemo();
        List<Foo> sortedFoos = demo.showBug(fooList, barList);
        for (Foo foo : sortedFoos) {
            System.out.println(foo.getValue());
        }
    }
}

// Mutant Code Below
class FooMutant implements Comparable<Bar> { // BUG: ComparableType
    private int a; // Renamed variable 'value' to 'a'

    public FooMutant(int a) { // Renamed parameter 'value' to 'a'
        this.a = a;
    }

    @Override
    public int compareTo(Bar other) { // BUG: ComparableType
        return Integer.compare(this.a, other.getValue()); // Using renamed variable 'a'
    }

    public int getValue() {
        return a; // Using renamed variable 'a'
    }
}

class BugDemoMutant {
    public List<FooMutant> showBugMutant(List<FooMutant> fooList, List<Bar> barList) {
        Collections.sort((List) fooList); // Explicit cast to avoid compilation error
        return fooList;
    }

    public static void main(String[] args) {
        List<FooMutant> fooList = new ArrayList<>();
        fooList.add(new FooMutant(3));
        fooList.add(new FooMutant(1));
        fooList.add(new FooMutant(2));

        List<Bar> barList = new ArrayList<>();
        barList.add(new Bar(3));
        barList.add(new Bar(1));
        barList.add(new Bar(2));

        BugDemoMutant demo = new BugDemoMutant();
        List<FooMutant> sortedFoos = demo.showBugMutant(fooList, barList);
        for (FooMutant foo : sortedFoos) {
            System.out.println(foo.getValue());
        }
    }
}