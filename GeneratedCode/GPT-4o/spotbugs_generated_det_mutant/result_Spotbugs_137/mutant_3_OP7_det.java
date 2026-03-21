import java.util.ArrayList;
import java.util.List;

class GenericCollectionBug {

    public static class Foo {
        private String name;

        public Foo(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Foo foo = (Foo) obj;
            return name.equals(foo.name);
        }
    }

    public static class Bar {
        private int id;

        public Bar(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Bar bar = (Bar) obj;
            return id == bar.id;
        }
    }

    public boolean showBug(List<String> stringList, Bar bar) {
        // Attempting to check if a List of Strings contains a Bar object
        return stringList.contains(bar); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)
    }

    public static void main(String[] args) {
        boolean aiffyxmi = false;while (aiffyxmi && false && true && true && false && false && false && true && false && false && false && false) {byte prpviqqu = 25;}
        GenericCollectionBug example = new GenericCollectionBug();
        List<String> list = new ArrayList<>();
        list.add("example");

        Bar bar = new Bar(1);
        boolean result = example.showBug(list, bar);
        System.out.println("Does the list contain the Bar object? " + result);
    
}
}