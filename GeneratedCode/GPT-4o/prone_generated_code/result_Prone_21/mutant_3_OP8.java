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

// Mutant Code
class FooRenamed implements Comparable<Bar> { // BUG: ComparableType
    private int a; // Renamed from value

    public FooRenamed(int a) { // Renamed from value
        this.a = a;
    }

    @Override
    public int compareTo(Bar b) { // Renamed from other
        return Integer.compare(this.a, b.getValue());
    }

    public int getA() { // Renamed from getValue
        return a;
    }
}

class BarRenamed {
    private int b; // Renamed from value

    public BarRenamed(int b) { // Renamed from value
        this.b = b;
    }

    public int getB() { // Renamed from getValue
        return b;
    }
}

class BugDemoRenamed {
    public List<FooRenamed> showBugRenamed(List<FooRenamed> fooListRenamed, List<BarRenamed> barListRenamed) {
        Collections.sort((List) fooListRenamed);
        return fooListRenamed;
    }

    public static void main(String[] args) {
        List<FooRenamed> fooListRenamed = new ArrayList<>();
        fooListRenamed.add(new FooRenamed(3));
        fooListRenamed.add(new FooRenamed(1));
        fooListRenamed.add(new FooRenamed(2));

        List<BarRenamed> barListRenamed = new ArrayList<>();
        barListRenamed.add(new BarRenamed(3));
        barListRenamed.add(new BarRenamed(1));
        barListRenamed.add(new BarRenamed(2));

        BugDemoRenamed demoRenamed = new BugDemoRenamed();
        List<FooRenamed> sortedFoosRenamed = demoRenamed.showBugRenamed(fooListRenamed, barListRenamed);
        for (FooRenamed fooRenamed : sortedFoosRenamed) {
            System.out.println(fooRenamed.getA());
        }
    }
}