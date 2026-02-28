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
    }
}

// Mutant 1: Unreachable if-else statement
class NullPointerBug {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            if (getCondition()) {
                // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
                resource.close();
            } else {
                // Unreachable code
                System.out.println("Unreachable code");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean getCondition() {
        return false;
    }
}

// Mutant 2: Unreachable if-else statement
class NullPointerBug {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            if (getCondition()) {
                // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
                resource.close();
            } else if (getCondition()) {
                // Unreachable code
                System.out.println("Unreachable code");
            } else {
                // Unreachable code
                System.out.println("Unreachable code");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean getCondition() {
        return false;
    }
}