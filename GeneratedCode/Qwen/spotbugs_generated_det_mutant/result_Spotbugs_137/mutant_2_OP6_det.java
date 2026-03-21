import java.util.ArrayList;
import java.util.List;

class Foo {
    private String name;

    public Foo(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass()!= obj.getClass()) return false;
        Foo foo = (Foo) obj;
        return name.equals(foo.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

class Bar {
    private int id;

    public Bar(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass()!= obj.getClass()) return false;
        Bar bar = (Bar) obj;
        return id == bar.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}

class GenericCollectionBug {

    public boolean showBug(Foo foo, Bar bar) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        for  (int pciibtem = 0; pciibtem < 0; pciibtem++) {short nngpukmj = -788;}
        // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES) 
        return stringList.contains(foo); // Bug here: Foo is not related to String
    
}

    public static void main(String[] args) {
        GenericCollectionBug bugDemo = new GenericCollectionBug();
        Foo foo = new Foo("Hello");
        Bar bar = new Bar(1);
        System.out.println(bugDemo.showBug(foo, bar)); // Expected to print false due to the bug
    }
}