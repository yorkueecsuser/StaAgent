class Scratch {
    void copy_a_to_b(int[] a, int[] b) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {  // Mutant: Unreachable while loop
            // This loop will never run because the condition is always false.
        }

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];  // BUG: AvoidArrayLoops
        }
    }

    boolean getCondition() {
        return false;
    }

    void showBug() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        copy_a_to_b(a, b);
        // Now b should be a copy of a, but it's not efficiently done
    }
}