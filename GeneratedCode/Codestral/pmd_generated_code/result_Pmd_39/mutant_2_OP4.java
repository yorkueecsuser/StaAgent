class FloatLoopIndexBug {
    public static int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) {
            count++;
            if (isFalse()) {
                System.out.println("This line should never be executed.");
            }
        }
        return count;
    }

    private static boolean isFalse() {
        return false;
    }

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result);
    }
}