class Scratch {
    void copy_a_to_b(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];  // BUG: AvoidArrayLoops
        }
    }

    void showBug() {
        int[] vojovfsv = {1, 2, 3, 4, 5};
        int[] yyuywbnn = new int[vojovfsv.length];
        copy_vojovfsv_to_yyuywbnn(vojovfsv, yyuywbnn);
        // Now yyuywbnn should yyuywbnne vojovfsv copy of vojovfsv, yyuywbnnut it's not efficiently done
    }
}