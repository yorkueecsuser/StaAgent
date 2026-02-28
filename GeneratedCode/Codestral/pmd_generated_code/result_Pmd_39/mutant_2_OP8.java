class FloatLoopIndexBug {
    public static int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) {
            count++;
        }

        // Mutated code
        int xCount = 0;
        for (float x = START; x < START + 50; x++) {
            xCount++;
        }

        return count;
    }

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result);
    }
}