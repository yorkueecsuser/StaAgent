class Scratch {
    boolean alwaysFalse() {
        return false;
    }

    void copy_a_to_b(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        // Inserted unreachable for loop
        for (int j = 0; alwaysFalse(); j++) {
            System.out.println("This line will never be executed.");
        }
    }

    void showBug() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        copy_a_to_b(a, b);
        // Now b should be a copy of a, but it's not efficiently done
    }
}