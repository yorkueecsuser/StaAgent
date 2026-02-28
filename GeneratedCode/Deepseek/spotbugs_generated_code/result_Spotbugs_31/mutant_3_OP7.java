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

        // Mutation Operator: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            set.add(obj1);
        }

        set.add(obj1);
        set.add(obj2);

        System.out.println("Size of the set: " + set.size()); // Expected output: 1, Actual output: 2
    }

    // Method to dynamically get condition for the while loop
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnhashableClass unhashableClass = new UnhashableClass(null);
        unhashableClass.showBug();
    }
}