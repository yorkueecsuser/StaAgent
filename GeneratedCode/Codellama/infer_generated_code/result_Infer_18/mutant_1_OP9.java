class JavaAllocNegativeSizeExample {
    public static void main(String[] args) {
        // BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE​
        int[] tempArray = new int[Math.abs(50)];

        do {
            for (int j = 0; j < 2; j++) {
                if (i + j > 0) {
                    int result = 10;

                    // Use in array allocation
                    int size = Math.abs(result) % 50;
                    tempArray = new int[size];

                    System.out.println("Result: " + result + ", Array size: " + size);
                }
            }
        } while (i < 2);
    }
}