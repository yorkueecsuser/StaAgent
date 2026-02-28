class BuggyFinalizer {
    public void finalize() {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
        while (false) {
            // Unreachable code
        }
    }
}