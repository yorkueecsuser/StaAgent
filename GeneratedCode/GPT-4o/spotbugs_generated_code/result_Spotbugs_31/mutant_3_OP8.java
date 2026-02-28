import java.util.HashSet;
import java.util.Objects;

class UnhashableClassExample {

    // Inner class that defines equals but not hashCode
    static class UnhashableClass {
        private String a; // Renamed from 'name' to 'a'

        public UnhashableClass(String a) { // Renamed parameter from 'name' to 'a'
            this.a = a; // Renamed variable 'name' to 'a'
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            UnhashableClass that = (UnhashableClass) obj;
            return Objects.equals(a, that.a); // Renamed variable 'name' to 'a'
        }

        // BUG: HE: Use of class without a hashCode() method in a hashed data structure (HE_USE_OF_UNHASHABLE_CLASS)
    }

    // Method to demonstrate the bug
    public static HashSet<UnhashableClass> showBug(String[] b) { // Renamed parameter from 'names' to 'b'
        HashSet<UnhashableClass> set = new HashSet<>();
        for (String c : b) { // Renamed loop variable from 'name' to 'c'
            set.add(new UnhashableClass(c));
        }
        return set;
    }

    public static void main(String[] args) {
        String[] b = {"Alice", "Bob", "Charlie"}; // Renamed variable from 'names' to 'b'
        HashSet<UnhashableClass> result = showBug(b);
        System.out.println("Resulting HashSet size: " + result.size());
    }
}