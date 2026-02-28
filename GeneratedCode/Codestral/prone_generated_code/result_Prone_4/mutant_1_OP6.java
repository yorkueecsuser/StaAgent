// Java code that demonstrates ArrayHashCode bug with Unreachable for loop mutant
class ArrayHashCodeBug {

    private boolean getCondition() {
        return false; // Method to dynamically return false for unreachable loop
    }

    public int showBug(int[] array) {
        for (int i = 0; getCondition(); i++) { // Inserted unreachable for loop
            System.out.println("This line will never be executed");
        }
        return array.hashCode();
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println(new ArrayHashCodeBug().showBug(array1));
        System.out.println(new ArrayHashCodeBug().showBug(array2));
    }
}