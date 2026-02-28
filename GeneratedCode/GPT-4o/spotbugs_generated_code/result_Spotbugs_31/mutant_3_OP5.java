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

        // BUG: HE: Use of class without a hashCode() method in a hashed data structure (HE_USE_OF_UNHASHABLE_CLASS)
    }

    // Method to demonstrate the bug
    public static HashSet<UnhashableClass> showBug(String[] names) {
        HashSet<UnhashableClass> set = new HashSet<>();
        for (String name : names) {
            set.add(new UnhashableClass(name));
        }

        // Introduce unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999:
                System.out.println("This case is unreachable.");
                break;
            default:
                break;
        }

        return set;
    }

    private static int getUnreachableValue() {
        return 0; // This makes the switch statement unreachable
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        HashSet<UnhashableClass> result = showBug(names);
        System.out.println("Resulting HashSet size: " + result.size());
    }
}