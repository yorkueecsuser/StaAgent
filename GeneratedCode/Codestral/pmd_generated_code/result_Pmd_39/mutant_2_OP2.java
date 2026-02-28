class FloatLoopIndexBug {
    public static int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) // original loop
            count++;
        for (float f = START; f < START + 50; f++) // mutant: duplicated loop
            count++;
        return count;
    }

    public static void main(String[] args) {
        int result = showBug();
        // Prints 100 because the loop is now executed twice
        System.out.println(result);
    }
}