class Scratch {
    void copy_a_to_b(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
            if (getUnreachableCondition()) {
                System.out.println("This is an unreachable if-else statement.");
            } else {
                System.out.println("This else statement is always unreachable.");
            }
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    void showBug() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        copy_a_to_b(a, b);
    }
}