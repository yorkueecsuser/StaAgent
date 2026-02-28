class BuggyFinalizer {
    public void finalize() { // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }

    // Unreachable switch statement mutation
    public void switchStatementMutation() {
        int x = 0;
        switch (x) {
            case 1:
                System.out.println("Reachable code");
                break;
            case 2:
                System.out.println("Unreachable code");
                break;
            default:
                System.out.println("Default code");
                break;
        }
    }
}