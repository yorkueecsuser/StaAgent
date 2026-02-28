class FloatLoopIndexBug {
    public static int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) {
            int value = getUnreachableValue(); // Method that returns a value not covered by any case labels
            switch (value) {
                case 1:
                    // Unreachable code
                    break;
                default:
                    count++;
            }
        }
        return count;
    }

    // Method that returns a value not covered by any case labels
    private static int getUnreachableValue() {
        return -1;
    }

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result);
    }
}