class FloatLoopIndexBug {
    public static int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) { // BUG: DontUseFloatTypeForLoopIndices
            count++;
        }

        // Mutant code: Unreachable switch statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            int value = 0;
            switch (value) {
                case 1:
                    // This code will never be executed
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return count;
    }

    public static boolean getCondition() {
        // This method is used to ensure the switch statement is unreachable
        return false;
    }

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result);
    }
}