class FloatLoopIndexBug {
    public static int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) {
            count++;
            // Inserted unreachable if statement
            boolean isUnreachable = false;
            if (isUnreachable) {
                System.out.println("This code will never execute");
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result);
    }
}