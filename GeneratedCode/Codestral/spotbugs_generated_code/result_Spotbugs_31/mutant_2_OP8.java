import java.util.HashSet;
import java.util.Set;

class UnhashableClass {
    private String name;

    public UnhashableClass(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;
        UnhashableClass that = (UnhashableClass) obj;
        return name.equals(that.name);
    }

    public void showBug() {
        Set<UnhashableClass> set = new HashSet<>();
        UnhashableClass objA = new UnhashableClass("Test");
        UnhashableClass objB = new UnhashableClass("Test");

        set.add(objA);
        set.add(objB);

        System.out.println("Size of the set: " + set.size()); // Expected output: 1, Actual output: 2
    }

    public static void main(String[] args) {
        UnhashableClass unhashableClass = new UnhashableClass(null);
        unhashableClass.showBug();
    }
}