class Scratch {
    boolean alwaysFalse() {
        return false;
    }

    void copy_a_to_b(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
            if (alwaysFalse()) {  // Unreachable if-else statement
                System.out.println("This line should never be executed.");
            } else {
                // This else branch is also unreachable, but it's there to make the if-else statement syntactically correct.
                System.out.println("This line should also never be executed.");
            }
        }
    }

    void showBug() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        copy_a_to_b(a, b);
    }
}