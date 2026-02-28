import java.util.HashSet;
import java.util.Set;

class UnhashableClassExample {
    private String name;

    // Constructor
    public UnhashableClassExample(String name) {
        this.name = name;
    }

    // Overriding equals method
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass()!= this.getClass()) {
            return false;
        }
        UnhashableClassExample other = (UnhashableClassExample) obj;
        return this.name.equals(other.name);
    }

    public void showBug() {
        Set<UnhashableClassExample> set = new HashSet<>();
        UnhashableClassExample obj1 = new UnhashableClassExample("Object1");
        UnhashableClassExample obj2 = new UnhashableClassExample("Object1");
        set.add(obj1);

        // Adding unreachable if-else statement
        boolean shouldNotRun = getCondition();
        if (shouldNotRun) {
            set.add(obj2);
        } else {
            // Unreachable code
            System.out.println("This code should not be executed.");
        }

        System.out.println("Size of the set: " + set.size());  // Expected size: 1, Actual size: 1
    }

    // Dummy method to avoid compile-time constant error
    private boolean getCondition() {
        return false;
    }
}