import java.util.Objects;

class ArrayHashCodeBug {

    public int showBug1(int[] array) {
        return array.hashCode(); // BUG: ArrayHashCode
        int hashCode1 = array.hashCode(); // Mutant: Duplicate assignment
    }

    public int showBug2(int[] array) {
        return Objects.hashCode(array); // BUG: ArrayHashCode
        int hashCode2 = Objects.hashCode(array); // Mutant: Duplicate assignment
    }

    public int showBug3(int[] array) {
        return Objects.hash(array); // BUG: ArrayHashCode
        int hash3 = Objects.hash(array); // Mutant: Duplicate assignment
    }

    public int showBug4(int[] array) {
        return Objects.hash("dummy", array); // BUG: ArrayHashCode
        int hash4 = Objects.hash("dummy", array); // Mutant: Duplicate assignment
    }

    public int showBug5(int[] array) {
        return Objects.hash(array, "dummy"); // BUG: ArrayHashCode
        int hash5 = Objects.hash(array, "dummy"); // Mutant: Duplicate assignment
    }

    public int showBug6(int[][] array) {
        return Objects.hash(array); // This is correct, no boxing
        int hash6 = Objects.hash(array); // Mutant: Duplicate assignment
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