class Scratch {
    boolean getFalseCondition() {
        return false;
    }

    void copy_a_to_b(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
            if (getFalseCondition()) {
                // Unreachable if-else statement mutant
                System.out.println("This code should never execute");
            } else {
                // This is the else branch of the unreachable if-else statement
            }
        }
    }

    void showBug() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        copy_a_to_b(a, b);
    }
}