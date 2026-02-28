import java.util.Objects;

class ArrayHashCodeBug {

    public int showBug1(int[] array) {
        return array.hashCode(); // BUG: ArrayHashCode
    }

    public int showBug2(int[] x) {
        return Objects.hashCode(x); // BUG: ArrayHashCode
    }

    public int showBug3(int[] y) {
        return Objects.hash(y); // BUG: ArrayHashCode
    }

    public int showBug4(int[] z) {
        return Objects.hash("dummy", z); // BUG: ArrayHashCode
    }

    public int showBug5(int[] w) {
        return Objects.hash(w, "dummy"); // BUG: ArrayHashCode
    }

    public int showBug6(int[][] v) {
        return Objects.hash(v); // This is correct, no boxing
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