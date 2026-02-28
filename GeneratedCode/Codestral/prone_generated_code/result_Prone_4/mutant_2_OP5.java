// Java code that demonstrates ArrayHashCode bug with unreachable switch statement mutant
class ArrayHashCodeBug {

    private boolean getCondition() {
        return false; // always return false to make the switch statement unreachable
    }

    public int showBug(int[] array) {
        boolean condition = getCondition();
        if (condition) {
            int value = 1; // just to satisfy the compiler
            switch (value) {
                case 1:
                    // unreachable code
                    System.out.println("Unreachable code executed!");
                    break;
                default:
                    // default case
                    break;
            }
        }

        return array.hashCode(); // BUG: ArrayHashCode
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println(new ArrayHashCodeBug().showBug(array1));
        System.out.println(new ArrayHashCodeBug().showBug(array2));
    }
}