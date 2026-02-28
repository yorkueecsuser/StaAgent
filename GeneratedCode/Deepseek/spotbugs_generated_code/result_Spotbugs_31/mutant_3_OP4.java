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

        // Adding unreachable if-else statement
        if (getUnreachableCondition()) {
            // This block is unreachable
            System.out.println("This code should never be executed");
        } else {
            return name.equals(that.name);
        }

        // This return is unreachable
        return false;
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    // BUG: HE: Use of class without a hashCode() method in a hashed data structure (HE_USE_OF_UNHASHABLE_CLASS)
    // Not implementing hashCode() method results in inconsistent behavior in hash data structures

    public void showBug() {
        Set<UnhashableClass> set = new HashSet<>();
        UnhashableClass obj1 = new UnhashableClass("Test");
        UnhashableClass obj2 = new UnhashableClass("Test");

        set.add(obj1);
        set.add(obj2);

        System.out.println("Size of the set: " + set.size()); // Expected output: 1, Actual output: 2
    }

    public static void main(String[] args) {
        UnhashableClass unhashableClass = new UnhashableClass(null);
        unhashableClass.showBug();
    }
}