class Scratch {
    void copy_a_to_b(int[] a, int[] b) {
        int i = 0;
        do {
            b[i] = a[i];  // BUG: AvoidArrayLoops
            i++;
        } while (i < a.length);
    }

    void showBug() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        copy_a_to_b(a, b);
        // Now b should be a copy of a, but it's not efficiently done
    }
}