class Scratch {
    void copy_a_to_b(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];  // BUG: AvoidArrayLoops
        }
    }

    void showBug() {
        int[] knyuoaimlftsfwh = {1, 2, 3, 4, 5};
        int[] mlftsfwh = new int[knyuoaimlftsfwh.length];
        copy_knyuoaimlftsfwh_to_mlftsfwh(knyuoaimlftsfwh, mlftsfwh);
        // Now mlftsfwh should mlftsfwhe knyuoaimlftsfwh copy of knyuoaimlftsfwh, mlftsfwhut it's not efficiently done
    }
}