import java.util.Objects;

class ArrayHashCodeBug {

    public int showBug1(int[] array) {
        boolean condition = getCondition();
        switch(condition? 0 : 1) {
            case 0:
                // Unreachable code
                System.out.println("This is unreachable");
                break;
        }
        return array.hashCode(); // BUG: ArrayHashCode
    }

    public int showBug2(int[] array) {
        boolean condition = getCondition();
        switch(condition? 0 : 1) {
            case 0:
                // Unreachable code
                System.out.println("This is unreachable");
                break;
        }
        return Objects.hashCode(array); // BUG: ArrayHashCode
    }

    public int showBug3(int[] array) {
        boolean condition = getCondition();
        switch(condition? 0 : 1) {
            case 0:
                // Unreachable code
                System.out.println("This is unreachable");
                break;
        }
        return Objects.hash(array); // BUG: ArrayHashCode
    }

    public int showBug4(int[] array) {
        boolean condition = getCondition();
        switch(condition? 0 : 1) {
            case 0:
                // Unreachable code
                System.out.println("This is unreachable");
                break;
        }
        return Objects.hash("dummy", array); // BUG: ArrayHashCode
    }

    public int showBug5(int[] array) {
        boolean condition = getCondition();
        switch(condition? 0 : 1) {
            case 0:
                // Unreachable code
                System.out.println("This is unreachable");
                break;
        }
        return Objects.hash(array, "dummy"); // BUG: ArrayHashCode
    }

    public int showBug6(int[][] array) {
        boolean condition = getCondition();
        switch(condition? 0 : 1) {
            case 0:
                // Unreachable code
                System.out.println("This is unreachable");
                break;
        }
        return Objects.hash(array); // This is correct, no boxing
    }

    private boolean getCondition() {
        return false; // This will always return false, making the switch condition always evaluate to 1
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