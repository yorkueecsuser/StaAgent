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

        return set; // Returns a set that might contain duplicates
    }

    public static void main(String[] args) {
        UnpairedEqualsHashCode example = new UnpairedEqualsHashCode("Test", 0);
        Set<UnpairedEqualsHashCode> result = example.showBug();
        System.out.println("Set size (should be 1 if hashCode was implemented): " + result.size());
    }
}

// Mutant Code with Renaming
class Mutant_UnpairedEqualsHashCode {
    
    private String x; // Renamed 'name' to 'x'
    private int age;

    public Mutant_UnpairedEqualsHashCode(String x, int age) { // Renamed 'name' to 'x'
        this.x = x; // Renamed 'name' to 'x'
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Mutant_UnpairedEqualsHashCode that = (Mutant_UnpairedEqualsHashCode) obj;
        return age == that.age && x.equals(that.x); // Renamed 'name' to 'x'
    }

    // Missing hashCode() method - violates the equals-hashCode contract

    public Set<Mutant_UnpairedEqualsHashCode> showBug() {
        Set<Mutant_UnpairedEqualsHashCode> set = new HashSet<>();
        Mutant_UnpairedEqualsHashCode obj1 = new Mutant_UnpairedEqualsHashCode("Alice", 30);
        Mutant_UnpairedEqualsHashCode obj2 = new Mutant_UnpairedEqualsHashCode("Alice", 30);

        set.add(obj1);
        set.add(obj2);

        return set;
    }

    public static void main(String[] args) {
        Mutant_UnpairedEqualsHashCode example = new Mutant_UnpairedEqualsHashCode("Test", 0);
        Set<Mutant_UnpairedEqualsHashCode> result = example.showBug();
        System.out.println("Set size (should be 1 if hashCode was implemented): " + result.size());
    }
}