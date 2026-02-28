class BuggyFinalizer {
    public void finalize() { // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }
}

// Mutant 1: Unreachable if statement
class BuggyFinalizer {
    public void finalize() { // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
        if (false) {
            System.out.println("This code is unreachable");
        }
    }

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }
}

// Mutant 2: Unreachable while loop
class BuggyFinalizer {
    public void finalize() { // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
        while (false) {
            System.out.println("This code is unreachable");
        }
    }

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }
}

// Mutant 3: Unreachable for loop
class BuggyFinalizer {
    public void finalize() { // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
        for (int i = 0; false; i++) {
            System.out.println("This code is unreachable");
        }
    }

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }
}

// Mutant 4: Unreachable if-else statement
class BuggyFinalizer {
    public void finalize() { // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
        if (false) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is reachable");
        }
    }

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }
}

// Mutant 5: Unreachable switch statement
class BuggyFinalizer {
    public void finalize() { // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
        switch (0) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                System.out.println("This code is reachable");
                break;
        }
    }

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }
}