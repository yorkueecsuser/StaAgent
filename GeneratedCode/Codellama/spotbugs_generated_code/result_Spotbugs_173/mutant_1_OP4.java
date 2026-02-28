class BuggyFinalizer {
    public void finalize() { // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }

    // Mutant code: Unreachable if-else statement
    public void finalize() {
        if (false) {
            System.out.println("Finalize method called");
        } else {
            System.out.println("This branch is unreachable");
        }
    }
}