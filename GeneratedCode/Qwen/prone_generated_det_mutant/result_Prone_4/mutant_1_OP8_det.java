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
        return Objects.hash(array, "dummy"); // BUG: ArrayHashCode
    }

    public int showBug6(int[][] array) {
        return Objects.hash(array); // This is correct, no boxing
    }

    public static void main(String[] args) {
        ArrayHashCodeBug bugDemo = new ArrayHashCodeBug();
        int[] xsfipsbs = {1, 2, 3};
        System.out.println("showBug1: " + bugDemo.showBug1(xsfipsbs));
        System.out.println("showBug2: " + bugDemo.showBug2(xsfipsbs));
        System.out.println("showBug3: " + bugDemo.showBug3(xsfipsbs));
        System.out.println("showBug4: " + bugDemo.showBug4(xsfipsbs));
        System.out.println("showBug5: " + bugDemo.showBug5(xsfipsbs));
        int[][] cqaqegsd = {{1, 2}, {3, 4}};
        System.out.println("showBug6: " + bugDemo.showBug6(cqaqegsd));
    }
}