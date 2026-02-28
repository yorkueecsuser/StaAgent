// Java code that demonstrates ArrayHashCode bug with an unreachable switch statement mutant
class ArrayHashCodeBug {

    public int showBug(int[] array) {
        int hashCode = array.hashCode(); // BUG: ArrayHashCode

        // Adding unreachable switch statement mutant
        boolean condition = getCondition();
        if (condition) {
            int value = 0;
            switch (value) {
                case 1:
                    // Unreachable code
                    System.out.println("Unreachable code executed!");
                    break;
            }
        }

        return hashCode;
    }

    private boolean getCondition() {
        // This method always returns false to make the switch statement unreachable
        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println(new ArrayHashCodeBug().showBug(array1));
        System.out.println(new ArrayHashCodeBug().showBug(array2));
    }
}