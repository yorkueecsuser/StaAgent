class FloatLoopIndexBug {
    public static int showBug() {
        final int START = 2000000000;
        int count = 0;

        // Mutation: Unreachable for loop
        boolean condition = false;
        for (int i = 0; condition; i++) {
            System.out.println("This line should never be executed.");
        }

        for (float f = START; f < START + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            count++;
        return count;
    }

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result);
    }
}