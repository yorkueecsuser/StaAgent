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

        // Mutated code with renaming variable 'name' to 'x'
        Set<EqualsHashCodeBug> xet = new HashSet<>();
        EqualsHashCodeBug xerson1 = new EqualsHashCodeBug("Alice", 30);
        EqualsHashCodeBug xerson2 = new EqualsHashCodeBug("Alice", 30);

        xet.add(xerson1);
        xet.add(xerson2);

        System.out.println("Mutated Set size: " + xet.size());
    }

    public static void main(String[] args) {
        EqualsHashCodeBug example = new EqualsHashCodeBug("Alice", 30);
        example.showBug();
    }
}