class FloatLoopIndexBug {
    public static boolean getFalseCondition() {
        return false;
    }

    public static int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) {
            if (getFalseCondition()) {
                // Unreachable code
                System.out.println("This line is unreachable");
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result);
    }
}