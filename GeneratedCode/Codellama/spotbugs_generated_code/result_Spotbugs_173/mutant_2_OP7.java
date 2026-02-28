class BuggyFinalizer {
    public void finalize() { // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
        boolean conditionWhile = getCondition();
        while (false) { // Inserting unreachable while loop into the program
            System.out.println("This loop is always false");
        }
    }
}