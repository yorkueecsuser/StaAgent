class Scratch {
    void copy_a_to_b(int[] a, int[] b) {
        boolean unreachableCondition = getCondition();
        while (unreachableCondition) {
            // This while loop is unreachable
        }
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
    }

    boolean getCondition() {
        return false;
    }

    void showBug() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        copy_a_to_b(a, b);
    }
}