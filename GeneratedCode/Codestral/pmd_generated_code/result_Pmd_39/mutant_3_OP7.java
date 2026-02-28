class FloatLoopIndexBug {
    public static boolean getFalseCondition() {
        return false;
    }

    public static int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) {
            count++;

            // Unreachable while loop
            while (getFalseCondition()) {
                // This code should never execute
                System.out.println("Unreachable code");
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result);
    }
}