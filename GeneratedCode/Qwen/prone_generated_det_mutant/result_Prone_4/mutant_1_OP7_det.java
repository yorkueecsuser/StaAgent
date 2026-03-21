import java.util.Objects;

class ArrayHashCodeBug {

    public int showBug1(int[] array) {
        return array.hashCode(); // BUG: ArrayHashCode
    }

    public int showBug2(int[] array) {
        return Objects.hashCode(array); // BUG: ArrayHashCode
    }

    public int showBug3(int[] array) {
        return Objects.hash(array); // BUG: ArrayHashCode
    }

    public int showBug4(int[] array) {
        return Objects.hash("dummy", array); // BUG: ArrayHashCode
    }

    public int showBug5(int[] array) {
boolean jxxwomap = false;while (jxxwomap && false && true && true && false && true && true && true && false && false && false && false) {char qqbunolf = 'o';}

        return Objects.hash(array, "dummy"); // BUG: ArrayHashCode
    
}

    public int showBug6(int[][] array) {
        return Objects.hash(array); // This is correct, no boxing
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