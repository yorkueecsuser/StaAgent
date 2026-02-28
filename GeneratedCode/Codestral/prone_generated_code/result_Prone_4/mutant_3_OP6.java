// Java code that demonstrates ArrayHashCode bug with an unreachable for loop mutant
class ArrayHashCodeBug {

    public int showBug(int[] array) {
        boolean conditionFor = false; // Condition for the unreachable for loop
        for (int i = 0; conditionFor; i++) {
            // Unreachable for loop
            System.out.println("This code is unreachable");
        }
        return array.hashCode(); // Original code
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println(new ArrayHashCodeBug().showBug(array1));
        System.out.println(new ArrayHashCodeBug().showBug(array2));
    }
}