class Scratch {
    void copy_a_to_b(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];  // BUG: AvoidArrayLoops

            // Mutation: Unreachable switch statement
            boolean shouldRun = getCondition();  // Assuming getCondition is a method that returns false
            if (!shouldRun) {
                int unreachableValue = -1;  // Assuming this is not a possible array index
                switch (unreachableValue) {
                    case 0:
                        System.out.println("This code should never be reached");
                        break;
                    default:
                        break;
                }
            }
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