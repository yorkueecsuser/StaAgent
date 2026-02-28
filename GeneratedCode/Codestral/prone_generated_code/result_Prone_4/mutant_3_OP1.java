// Java code that demonstrates ArrayHashCode bug with Dead Store mutation
import java.util.Random;

class ArrayHashCodeBug {

    public int showBug(int[] array) {
        int unusedVariable = generateRandomInt(); // DEAD STORE: Unused variable declaration
        return array.hashCode(); // BUG: ArrayHashCode
    }

    private int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println(new ArrayHashCodeBug().showBug(array1));
        System.out.println(new ArrayHashCodeBug().showBug(array2));
    }
}