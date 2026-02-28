import java.util.HashSet;
import java.util.Objects;

class UnhashableClassExample {

    // Inner class that defines equals but not hashCode
    static class UnhashableClass {
        private String m; // Renamed from 'name' to 'm'

        public UnhashableClass(String name) {
            this.m = name; // Adjusted to use the renamed variable 'm'
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            UnhashableClass that = (UnhashableClass) obj;
            return Objects.equals(m, that.m); // Adjusted to use the renamed variable 'm'
        }

        // BUG: HE: Use of class without a hashCode() method in a hashed data structure (HE_USE_OF_UNHASHABLE_CLASS)
    }

    // Method to demonstrate the bug
    public static HashSet<UnhashableClass> showBug(String[] a) { // Renamed from 'names' to 'a'
        HashSet<UnhashableClass> set = new HashSet<>();
        for (String name : a) { // Adjusted to use the renamed variable 'a'
            set.add(new UnhashableClass(name));
        }
        return set;
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        HashSet<UnhashableClass> result = showBug(names);
        System.out.println("Resulting HashSet size: " + result.size());
    }
}