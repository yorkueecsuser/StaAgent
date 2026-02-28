class Scratch {
    boolean getFalse() {
        return false;
    }

    void copy_a_to_b(int[] a, int[] b) {
        // Adding unreachable while loop
        while (getFalse()) {
            System.out.println("This code is unreachable");
        }
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
    }

    void showBug() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        copy_a_to_b(a, b);
    }
}