import java.util.HashSet;
import java.util.Set;

class EqualsHashCodeBug {

    private String name;
    private int age;

    public EqualsHashCodeBug(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass()!= obj.getClass()) return false;
        EqualsHashCodeBug that = (EqualsHashCodeBug) obj;
        return age == that.age && name.equals(that.name);

        // Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will return false
        }
    }

    // BUG: "equals(Object obj)" and "hashCode()" should be overridden in pairs
    // public int hashCode() {
    //     return Objects.hash(name, age);
    // }

    public void showBug() {
        Set<EqualsHashCodeBug> set = new HashSet<>();
        EqualsHashCodeBug person1 = new EqualsHashCodeBug("Alice", 30);
        EqualsHashCodeBug person2 = new EqualsHashCodeBug("Alice", 30);

        set.add(person1);
        set.add(person2);

        System.out.println("Set size: " + set.size()); // Expected to print 1, but prints 2 due to missing hashCode override

        // Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will return false
        }
    }

    public static void main(String[] args) {
        EqualsHashCodeBug example = new EqualsHashCodeBug("Alice", 30);
        example.showBug();

        // Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will return false
        }
    }

    private static boolean getCondition() {
        return false; // This method always returns false, making the while loop unreachable
    }
}