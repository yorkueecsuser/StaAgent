class Scratch {
    void copy_a_to_b(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        // Inserting an unreachable for loop
        boolean condition = false; // The condition is always false
        for (int j = 0; condition; j++) {
            // This block of code is unreachable
        }
    }

    void showBug() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        copy_a_to_b(a, b);
    }
}