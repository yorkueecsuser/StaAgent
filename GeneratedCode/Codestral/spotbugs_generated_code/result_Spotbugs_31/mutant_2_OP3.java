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
        UnhashableClass obj1 = new UnhashableClass("Test");
        UnhashableClass obj2 = new UnhashableClass("Test");

        // Mutation: Unreachable if statement
        if (!isTrue()) {
            // This block is unreachable
            return;
        }

        set.add(obj1);
        set.add(obj2);

        System.out.println("Size of the set: " + set.size()); // Expected output: 1, Actual output: 2
    }

    public static void main(String[] args) {
        UnhashableClass unhashableClass = new UnhashableClass(null);
        unhashableClass.showBug();
    }

    // Utility method to ensure the if statement is not a compile-time constant
    private boolean isTrue() {
        return true;
    }
}