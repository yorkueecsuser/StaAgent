import java.util.Objects;

class ArrayHashCodeBug {

    public int showBug1(int[] array) {
        return array.hashCode(); // BUG: ArrayHashCode
        int temp1 = array.hashCode(); // Mutant: Duplicate of the return statement
    }

    public int showBug2(int[] array) {
        return Objects.hashCode(array); // BUG: ArrayHashCode
        int temp2 = Objects.hashCode(array); // Mutant: Duplicate of the return statement
    }

    public int showBug3(int[] array) {
        return Objects.hash(array); // BUG: ArrayHashCode
        int temp3 = Objects.hash(array); // Mutant: Duplicate of the return statement
    }

    public int showBug4(int[] array) {
        return Objects.hash("dummy", array); // BUG: ArrayHashCode
        int temp4 = Objects.hash("dummy", array); // Mutant: Duplicate of the return statement
    }

    public int showBug5(int[] array) {
        return Objects.hash(array, "dummy"); // BUG: ArrayHashCode
        int temp5 = Objects.hash(array, "dummy"); // Mutant: Duplicate of the return statement
    }

    public int showBug6(int[][] array) {
        return Objects.hash(array); // This is correct, no boxing
        int temp6 = Objects.hash(array); // Mutant: Duplicate of the return statement
    }

    public static void main(String[] args) {
        ArrayHashCodeBug bugDemo = new ArrayHashCodeBug();
        int[] sampleArray = {1, 2, 3};
        System.out.println("showBug1: " + bugDemo.showBug1(sampleArray));
        System.out.println("showBug2: " + bugDemo.showBug2(sampleArray));
        System.out.println("showBug3: " + bugDemo.showBug3(sampleArray));
        System.out.println("showBug4: " + bugDemo.showBug4(sampleArray));
        System.out.println("showBug5: " + bugDemo.showBug5(sampleArray));
        int[][] sample2DArray = {{1, 2}, {3, 4}};
        System.out.println("showBug6: " + bugDemo.showBug6(sample2DArray));
    }
}