class BuggyFinalizer {
    public void finalize() { // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        String deadStore = "HelloWorld"; // Dead Store Mutation Operator
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }
}