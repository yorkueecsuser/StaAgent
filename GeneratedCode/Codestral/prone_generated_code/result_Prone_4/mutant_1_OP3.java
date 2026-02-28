// Java code that demonstrates ArrayHashCode bug with mutant
class ArrayHashCodeBug {

    public int showBug(int[] array) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            int length = array.length;
            if (length < 0) {
                // Unreachable code
                System.out.println("Unreachable code executed!");
            }
        }
        return array.hashCode(); // BUG: ArrayHashCode
    }

    private boolean getCondition() {
        // This method is just for the sake of compiling the code and avoiding 'constant condition' error.
        // In a real application, you can replace it with a meaningful condition.
        return Math.random() < 0.5;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println(new ArrayHashCodeBug().showBug(array1));
        System.out.println(new ArrayHashCodeBug().showBug(array2));
    }
}