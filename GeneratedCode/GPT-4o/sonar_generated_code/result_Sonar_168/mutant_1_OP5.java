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

        // Introducing unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999: // This case is unlikely to be reached because getUnreachableValue() will not return 999
                System.out.println("This is unreachable code");
                break;
        }

        return set; // Returns a set that might contain duplicates
    }

    private int getUnreachableValue() {
        return (int) (Math.random() * 100); // Randomly generates a value between 0 and 99
    }

    public static void main(String[] args) {
        UnpairedEqualsHashCode example = new UnpairedEqualsHashCode("Test", 0);
        Set<UnpairedEqualsHashCode> result = example.showBug();
        System.out.println("Set size (should be 1 if hashCode was implemented): " + result.size());
    }
}