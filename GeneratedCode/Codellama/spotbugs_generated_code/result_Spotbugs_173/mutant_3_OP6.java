class BuggyFinalizer {
    public void finalize() {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }

    // Mutant code: Unreachable for loop
    private void unreachableForLoop() {
        for (int i = 0; false; i++) {
            System.out.println("This code is unreachable");
        }
    }
}