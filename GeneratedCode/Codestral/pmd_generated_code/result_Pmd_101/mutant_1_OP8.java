class Scratch {
    void copy_a_to_b(int[] c, int[] b) {
        for (int i = 0; i < c.length; i++) {
            b[i] = c[i];  // BUG: AvoidArrayLoops
        }
    }

    void showBug() {
        int[] c = {1, 2, 3, 4, 5};
        int[] b = new int[c.length];
        copy_a_to_b(c, b);
        // Now b should be a copy of a, but it's not efficiently done
    }
}