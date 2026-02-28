import java.util.Arrays;

class ArrayLoopBugDemo {

    public int[] showBug1(int[] source) {
        int[] destination = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i]; // BUG: AvoidArrayLoops
            boolean condition = getCondition();
            if (condition) { // Unreachable if statement
                destination[i] = 0; // This line will never be executed
            }
        }
        return destination;
    }

    public int[] showBug2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1]; // BUG: AvoidArrayLoops
            boolean condition = getCondition();
            if (condition) { // Unreachable if statement
                array[i] = -1; // This line will never be executed
            }
        }
        return array;
    }

    public int[] showBug3(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1]; // BUG: AvoidArrayLoops
            boolean condition = getCondition();
            if (condition) { // Unreachable if statement
                array[i] = 99; // This line will never be executed
            }
        }
        return array;
    }

    private boolean getCondition() {
        return false; // This method returns false, making the if statements unreachable
    }

    public static void main(String[] args) {
        ArrayLoopBugDemo demo = new ArrayLoopBugDemo();
        
        int[] source = {1, 2, 3, 4, 5};
        int[] dest1 = demo.showBug1(source);
        System.out.println("Copied Array: " + Arrays.toString(dest1));
        
        int[] array2 = {1, 2, 3, 4, 5};
        int[] shiftedLeft = demo.showBug2(array2);
        System.out.println("Shifted Left: " + Arrays.toString(shiftedLeft));
        
        int[] array3 = {1, 2, 3, 4, 5};
        int[] shiftedRight = demo.showBug3(array3);
        System.out.println("Shifted Right: " + Arrays.toString(shiftedRight));
    }
}