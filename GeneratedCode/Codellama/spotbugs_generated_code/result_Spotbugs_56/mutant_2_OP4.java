import java.io.Closeable;

class NullPointerBug {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            resource.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Mutant code added
        boolean condition = getCondition();
        if (condition) {
            // Additional code for if-else branch
            System.out.println("This code is unreachable");
        } else {
            // Additional code for if-else branch
            System.out.println("This code is reachable");
        }
    }
}