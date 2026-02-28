import java.util.HashSet;
import java.util.Set;

class UnpairedEqualsHashCode {
    
    private String name;
    private int age;

    public UnpairedEqualsHashCode(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        UnpairedEqualsHashCode that = (UnpairedEqualsHashCode) obj;
        return age == that.age && name.equals(that.name);
    } // BUG: "equals(Object obj)" and "hashCode()" should be overridden in pairs

    // Missing hashCode() method - violates the equals-hashCode contract

    public Set<UnpairedEqualsHashCode> showBug() {
        Set<UnpairedEqualsHashCode> set = new HashSet<>();
        UnpairedEqualsHashCode obj1 = new UnpairedEqualsHashCode("Alice", 30);
        UnpairedEqualsHashCode obj2 = new UnpairedEqualsHashCode("Alice", 30);

        set.add(obj1);
        set.add(obj2); // This will not work as expected due to missing hashCode()

        // Inserting unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never print because the condition is unreachable.");
                break;
            default:
                // No default action needed
                break;
        }

        return set; // Returns a set that might contain duplicates
    }

    // Method to dynamically determine the switch condition
    private int getUnreachableValue() {
        // Always return a value that doesn't match any case in the switch
        return 0;
    }

    public static void main(String[] args) {
        UnpairedEqualsHashCode example = new UnpairedEqualsHashCode("Test", 0);
        Set<UnpairedEqualsHashCode> result = example.showBug();
        System.out.println("Set size (should be 1 if hashCode was implemented): " + result.size());
    }
}