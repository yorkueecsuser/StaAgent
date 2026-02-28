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
        return this.name.equals(other.name);  // Bug: Using equals without overriding hashCode
    }

    public void showBug() {
        Set<UnhashableClassExample> set = new HashSet<>();
        UnhashableClassExample obj1 = new UnhashableClassExample("Object1");
        UnhashableClassExample obj2 = new UnhashableClassExample("Object1");
        set.add(obj1);
        set.add(obj2);

        // Mutant Code - Duplication of assignment statement
        UnhashableClassExample obj3 = obj2;
        set.add(obj3);

        System.out.println("Size of the set: " + set.size());  // Expected size: 1, Actual size: 2
    }
}