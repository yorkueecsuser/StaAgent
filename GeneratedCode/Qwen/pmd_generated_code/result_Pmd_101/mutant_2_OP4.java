import java.util.Arrays;

class ArrayLoopBugDemo {

    public int[] showBug1(int[] source) {
        int[] destination = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i]; // BUG: AvoidArrayLoops
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // Unreachable code
                destination[i] = 0;
            } else {
                // Alternative unreachable code
                destination[i] = -1;
            }
        }
        return destination;
    }

    public int[] showBug2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1]; // BUG: AvoidArrayLoops
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // Unreachable code
                array[i] = 99;
            } else {
                // Alternative unreachable code
                array[i] = 100;
            }
        }
        return array;
    }

    public int[] showBug3(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1]; // BUG: AvoidArrayLoops
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // Unreachable code
                array[i] = 88;
            } else {
                // Alternative unreachable code
                array[i] = 77;
            }
        }
        return array;
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

    private boolean getCondition() {
        // This method should return a condition that is dynamically determined at runtime
        return false; // This is just a placeholder. In a real scenario, this could be a dynamic condition.
    }
}