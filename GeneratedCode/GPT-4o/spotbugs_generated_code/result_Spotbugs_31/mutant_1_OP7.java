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

        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This will never be printed.");
        }

        return set;
    }

    private static boolean getCondition() {
        // This method returns a constant false to mimic the unreachable while loop.
        return false;
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        HashSet<UnhashableClass> result = showBug(names);
        System.out.println("Resulting HashSet size: " + result.size());
    }
}