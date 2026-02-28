class BuggyFinalizer {
    public void finalize() { // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }

    public void renamedMethod() {
        System.out.println("Renamed method called");
    }
}