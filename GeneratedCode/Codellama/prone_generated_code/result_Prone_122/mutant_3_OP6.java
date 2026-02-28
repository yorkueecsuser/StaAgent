import java.util.Objects;

class NullTernary {
    public static void main(String[] args) {
        Integer foo = null;
        boolean flag = false;
        int x = flag? foo : null;
        System.out.println(x);

        // Unreachable for loop
        for (int i = 0; getCondition(); i++) {
            // code
        }
    }

    // Helper method to avoid using compile-time constants
    public static boolean getCondition() {
        // logic to determine condition
        return false;
    }
}