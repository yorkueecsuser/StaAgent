import java.util.HashSet;
import java.util.Set;

class HashingExample {

    // Class with equals method but without hashCode method
    static class UnhashableObject {
        private int value;

        public UnhashableObject(int value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass()!= obj.getClass()) return false;
            UnhashableObject that = (UnhashableObject) obj;
            return value == that.value;
        }

        // No hashCode() method overridden
    }

    // Method to demonstrate the bug
    public Set<UnhashableObject> showBug() {
        Set<UnhashableObject> set = new HashSet<>();
        set.add(new UnhashableObject(1)); // BUG: HE: Signature declares use of unhashable class in hashed construct (HE_SIGNATURE_DECLARES_HASHING_OF_UNHASHABLE_CLASS) 
        set.add(new UnhashableObject(1));

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case will never be executed
                System.out.println("This is an unreachable case.");
                break;
            case false:
                // This case will also never be executed
                System.out.println("This is another unreachable case.");
                break;
        }

        return set;
    }

    // Method to provide a dynamic condition for the switch statement
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        HashingExample example = new HashingExample();
        Set<UnhashableObject> result = example.showBug();
        System.out.println("Set size: " + result.size()); // Expected to print 2 due to unhashable nature
    }
}