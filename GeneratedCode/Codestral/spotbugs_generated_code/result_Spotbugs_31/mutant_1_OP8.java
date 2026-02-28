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

    // BUG: HE: Use of class without a hashCode() method in a hashed data structure (HE_USE_OF_UNHASHABLE_CLASS)
    // Not implementing hashCode() method results in inconsistent behavior in hash data structures

    public void showBug() {
        Set<UnhashableClass> container = new HashSet<>(); // Renamed'set' to 'container'
        UnhashableClass obj1 = new UnhashableClass("Test");
        UnhashableClass obj2 = new UnhashableClass("Test");

        container.add(obj1);
        container.add(obj2);

        System.out.println("Size of the container: " + container.size()); // Expected output: 1, Actual output: 2
    }

    public static void main(String[] args) {
        UnhashableClass unhashableClass = new UnhashableClass(null);
        unhashableClass.showBug();
    }
}