class FloatLoopIndexBug {
    public static int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            count++;

        // Mutant code based on the Duplication mutation operator
        float copied_f = f; // Duplicating the assignment statement
        count++; // Adding an extra increment to avoid any side effect

        return count;
    }

    public static void main(String[] args) {
        int result = showBug();
        // Prints 0 because (float) START == (float) (START + 50).
        // The termination test misbehaves due to floating point granularity.
        // Now with the mutant code, it might print a different result.
        System.out.println(result);
    }
}