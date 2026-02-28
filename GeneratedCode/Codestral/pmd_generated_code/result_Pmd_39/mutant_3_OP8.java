class FloatLoopIndexBug {
    public static int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            count++;

        // Mutant code: Renaming user-defined variable 'f' to 'i'
        int i = 0;
        for (i = START; i < START + 50; i++)
            count++;

        return count;
    }

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result);
    }
}