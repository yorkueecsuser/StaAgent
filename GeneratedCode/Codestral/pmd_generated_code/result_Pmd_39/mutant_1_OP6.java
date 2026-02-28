class FloatLoopIndexBug {
    public static int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++)
            count++;

        // Mutation: Inserting unreachable for loop
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            // This code is unreachable
            System.out.println("This line should never be executed");
        }

        return count;
    }

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result);
    }
}