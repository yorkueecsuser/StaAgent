class Scratch {
    void copy_a_to_b(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];  // BUG: AvoidArrayLoops
        }
    }

    void showBug() {
        int[] zxcesjdfcemchkd = {1, 2, 3, 4, 5};
        int[] xcesjdfc = new int[zxcesjdfcemchkd.length];
        copy_zxcesjdfcemchkd_to_xcesjdfc(zxcesjdfcemchkd, xcesjdfc);
        // Now xcesjdfc should xcesjdfce zxcesjdfcemchkd copy of zxcesjdfcemchkd, xcesjdfcut it's not efficiently done
    }
}