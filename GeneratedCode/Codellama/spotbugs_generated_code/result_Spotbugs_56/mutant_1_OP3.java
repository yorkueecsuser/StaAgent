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

// Mutant 1: Unreachable if statement
class NullPointerBugMutant1 {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            if (false) { // Added unreachable if branch
                resource.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Mutant 2: Unreachable while loop
class NullPointerBugMutant2 {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            while (false) { // Added unreachable while loop
                resource.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Mutant 3: Unreachable for loop
class NullPointerBugMutant3 {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            for (int i = 0; false; i++) { // Added unreachable for loop
                resource.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Mutant 4: Unreachable if-else statement
class NullPointerBugMutant4 {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            if (false) { // Added unreachable if branch
                resource.close();
            } else {
                // empty
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Mutant 5: Unreachable switch statement
class NullPointerBugMutant5 {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            switch (0) { // Added unreachable switch statement
                case 1:
                    resource.close();
                    break;
                default:
                    // empty
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}