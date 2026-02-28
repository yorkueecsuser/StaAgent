class FloatLoopIndexBug {
    public static int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) {
            count++;
            // Mutation: Unreachable switch statement
            switch(getUnreachableValue()) {
                case 1:
                    // This code will never be executed
                    System.out.println("Unreachable code executed!");
                    break;
            }
        }
        return count;
    }

    public static int getUnreachableValue() {
        return -1; // This value doesn't match any case in the switch statement
    }

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result);
    }
}