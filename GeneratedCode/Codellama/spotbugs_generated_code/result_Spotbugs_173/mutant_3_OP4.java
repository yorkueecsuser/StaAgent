class BuggyFinalizer {
    public void finalize() {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }

    // Mutant code: Unreachable if-else statement
    public void unreachableIfElse(boolean condition) {
        if (condition) {
            System.out.println("Reachable branch");
        } else {
            System.out.println("Unreachable branch");
        }
    }
}