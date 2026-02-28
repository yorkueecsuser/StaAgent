class Scratch {
    void copy_a_to_b(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];  // BUG: AvoidArrayLoops

            // Unreachable switch statement mutant
            boolean shouldRun = false;
            if (shouldRun) {
                int value = 0;
                switch (value) {
                    case 1:
                        // This code will never be executed
                        System.out.println("This is an unreachable switch case.");
                        break;
                    default:
                        break;
                }
            }
        }
    }

    void showBug() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        copy_a_to_b(a, b);
        // Now b should be a copy of a, but it's not efficiently done
    }
}