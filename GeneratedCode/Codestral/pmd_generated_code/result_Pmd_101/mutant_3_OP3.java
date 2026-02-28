class Scratch {
    void copy_a_to_b(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
            if (isUnreachable()) {  // Unreachable if statement mutant
                System.out.println("This line should never be executed.");
            }
        }
    }

    // Method to determine if the condition is false at runtime
    boolean isUnreachable() {
        return false;
    }

    void showBug() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        copy_a_to_b(a, b);
    }
}