import java.util.HashSet;
import java.util.Set;

class UnhashableClass {
    private String name;

    private boolean getCondition() {
        // This method always returns false to make the if-else branch unreachable
        return false;
    }

    public UnhashableClass(String name) {
        this.name = name;

        // Added mutation: Unreachable if-else statement
        if (getCondition()) {
            // This block will never execute
            System.out.println("This is an unreachable block");
        } else {
            // This is the else part of the unreachable if-else statement
            // It contains no code but is added to maintain the original code structure
        }
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