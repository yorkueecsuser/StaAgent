class BuggyFinalizer {
    public void finalize() { // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
        boolean condition = getCondition();
        while (condition) {
            // code
        }
    }

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }
}