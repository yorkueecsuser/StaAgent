class ArrayHashCodeBug {

    public int showBug(int[] array) {
        boolean shouldRun = getCondition();
        if (shouldRun) { // Unreachable if-else statement mutation
            int x = 1;
        } else {
            int y = 2;
        }
        return array.hashCode();
    }

    private boolean getCondition() { // Helper method to avoid using compile-time constants
        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println(new ArrayHashCodeBug().showBug(array1));
        System.out.println(new ArrayHashCodeBug().showBug(array2));
    }
}