class Scratch {
    void copy_a_to_b(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];  // BUG: AvoidArrayLoops
        }
    }

    void showBug() {
        int[] x = {1, 2, 3, 4, 5};
        int[] y = new int[x.length];
        copy_a_to_b(x, y);
        // Now y should be a copy of x, but it's not efficiently done
    }

    // Mutant code: Renaming variables
    void copy_x_to_y(int[] x, int[] y) {
        for (int j = 0; j < x.length; j++) {
            y[j] = x[j];
        }
    }

    void showMutant() {
        int[] z = {1, 2, 3, 4, 5};
        int[] w = new int[z.length];
        copy_x_to_y(z, w);
        // Now w should be a copy of z
    }
}