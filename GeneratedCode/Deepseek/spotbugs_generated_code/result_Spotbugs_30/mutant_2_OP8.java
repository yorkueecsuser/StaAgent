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
        UnhashableClassExample a = new UnhashableClassExample("Object1"); // Renamed obj1 to a
        UnhashableClassExample b = new UnhashableClassExample("Object1"); // Renamed obj2 to b
        set.add(a);
        set.add(b);
        System.out.println("Size of the set: " + set.size());  // Expected size: 1, Actual size: 2
    }
}