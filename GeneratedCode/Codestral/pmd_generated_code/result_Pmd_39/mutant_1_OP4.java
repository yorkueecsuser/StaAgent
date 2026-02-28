class FloatLoopIndexBug {
    public static int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) {
            count++;
            boolean condition = false; // Unreachable condition
            if (condition) {
                // Unreachable code
                System.out.println("This code should not be executed.");
            } else {
                // Continue with the loop
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result);
    }
}