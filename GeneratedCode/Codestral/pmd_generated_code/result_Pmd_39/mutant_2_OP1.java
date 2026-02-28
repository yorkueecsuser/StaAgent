class FloatLoopIndexBug {
    public static int showBug() {
        final int START = 2000000000;
        int count = 0;
        int deadStoreVar;   // Added Dead Store variable
        for (float f = START; f < START + 50; f++) {
            count++;
            deadStoreVar = 5;  // Assign some value to the Dead Store variable
        }
        return count;
    }

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result);
    }
}