class Scratch {
    boolean getCondition() {
        return false; // This method always returns false, making the loop unreachable
    }

    void copy_a_to_b(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        // Inserted unreachable for loop
        for (int j = 0; getCondition(); j++) {
            System.out.println("This line will never be executed.");
        }
    }

    void showBug() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        copy_a_to_b(a, b);
    }
}