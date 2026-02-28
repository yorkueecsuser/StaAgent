import java.util.HashSet;
import java.util.Objects;

class UnhashableClassExample {

    // Inner class that defines equals but not hashCode
    static class UnhashableClass {
        private String name;

        public UnhashableClass(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            UnhashableClass that = (UnhashableClass) obj;
            return Objects.equals(name, that.name);
        }

        // BUG: HE: Use of class without a hashCode() method in a hashed data structure (HE_USE_OF_UNHASHABLE_CLASS)
    }

    // Method to demonstrate the bug
    public static HashSet<UnhashableClass> showBug(String[] names) {
        HashSet<UnhashableClass> set = new HashSet<>();
        for (String name : names) {
            set.add(new UnhashableClass(name));
        }
        return set;
    }

    public static void main(String[] args) {
        String[] a = {"Alice", "Bob", "Charlie"};
        HashSet<UnhashableClass> result = showBug(a);
        System.out.println("Resulting HashSet size: " + result.size());
    }
}