import com.facebook.infer.annotation.NoAllocation;

class JavaAllocNegativeSizeExample {
    public static void main(String[] args) {
        JavaAllocNegativeSizeExample example = new JavaAllocNegativeSizeExample();
        example.complexUpperBoundCalculation();
    }

    @NoAllocation
    // BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE
    public int[] showBug() {
        int limit = Integer.MAX_VALUE - 10;
        int increment = 15;
        int result = limit + increment;
        int size = Math.abs(result) % 50;
        int[] tempArray1 = new int[size];
        return tempArray1;
    }

    public void complexUpperBoundCalculation() {
        int limit = Integer.MAX_VALUE - 10;
        int increment = 15;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (i + j > 0) {
                    int result = limit + increment;
                    int size = Math.abs(result) % 50;
                    int[] tempArray2 = new int[size]; //BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE
                    System.out.println("Result: " + result + ", Array size: " + size);
                }
            }
        }
    }
}