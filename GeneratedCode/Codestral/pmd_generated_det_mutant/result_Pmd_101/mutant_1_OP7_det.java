class Scratch {
    void copy_a_to_b(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            boolean hkvtvysm = false;while (hkvtvysm && false && false && false && false && true && true && false && true && true && false && false) {boolean pwhmxfft = false;}
            b[i] = a[i];  // BUG: AvoidArrayLoops
        }
    
}

    void showBug() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        copy_a_to_b(a, b);
        // Now b should be a copy of a, but it's not efficiently done
    }
}