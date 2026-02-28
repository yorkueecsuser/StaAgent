import java.util.HashSet;
import java.util.Set;

class EqualsHashCodeExample {

    private int id;
    private String name;

    public EqualsHashCodeExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        EqualsHashCodeExample that = (EqualsHashCodeExample) o;
        return id == that.id && (name!= null? name.equals(that.name) : that.name == null); // BUG: EqualsHashCode

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case is unreachable because getCondition() will never return true
                System.out.println("This is an unreachable switch case.");
                break;
        }
    }

    // hashCode() is not overridden

    public static void main(String[] args) {
        EqualsHashCodeExample example1 = new EqualsHashCodeExample(1, "Example");
        EqualsHashCodeExample example2 = new EqualsHashCodeExample(1, "Example");

        System.out.println("example1.equals(example2): " + example1.equals(example2));
        System.out.println("example1.hashCode(): " + example1.hashCode());
        System.out.println("example2.hashCode(): " + example2.hashCode());

        Set<EqualsHashCodeExample> set = new HashSet<>();
        set.add(example1);
        set.add(example2);

        System.out.println("Set size: " + set.size()); // This should be 1 if hashCode() was correctly overridden

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case is unreachable because getCondition() will never return true
                System.out.println("This is an unreachable switch case in main.");
                break;
        }
    }

    public String showBug() {
        EqualsHashCodeExample example1 = new EqualsHashCodeExample(1, "Example");
        EqualsHashCodeExample example2 = new EqualsHashCodeExample(1, "Example");

        StringBuilder result = new StringBuilder();
        result.append("example1.equals(example2): ").append(example1.equals(example2)).append("\n");
        result.append("example1.hashCode(): ").append(example1.hashCode()).append("\n");
        result.append("example2.hashCode(): ").append(example2.hashCode()).append("\n");

        Set<EqualsHashCodeExample> set = new HashSet<>();
        set.add(example1);
        set.add(example2);

        result.append("Set size: ").append(set.size()).append("\n"); // This should be 1 if hashCode() was correctly overridden
        return result.toString();

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case is unreachable because getCondition() will never return true
                result.append("This is an unreachable switch case in showBug.");
                break;
        }
    }

    private static boolean getCondition() {
        // This method always returns false, making the switch cases unreachable
        return false;
    }
}