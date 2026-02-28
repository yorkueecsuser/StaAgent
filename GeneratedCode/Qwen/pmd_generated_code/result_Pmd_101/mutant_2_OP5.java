import java.util.Arrays;

class ArrayLoopBugDemo {

    public int[] showBug1(int[] source) {
        int[] destination = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i]; // BUG: AvoidArrayLoops
            // Introduced Unreachable Switch Statement
            boolean condition = getCondition();
            switch (condition? 1 : 0) {
                case 2:
                    System.out.println("This is an unreachable switch case.");
                    break;
            }
        }
        return destination;
    }

    public int[] showBug2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1]; // BUG: AvoidArrayLoops
            // Introduced Unreachable Switch Statement
            boolean condition = getCondition();
            switch (condition? 1 : 0) {
                case 2:
                    System.out.println("This is an unreachable switch case.");
                    break;
            }
        }
        return array;
    }

    public int[] showBug3(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1]; // BUG: AvoidArrayLoops
            // Introduced Unreachable Switch Statement
            boolean condition = getCondition();
            switch (condition? 1 : 0) {
                case 2:
                    System.out.println("This is an unreachable switch case.");
                    break;
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
        return false; // This method always returns false, ensuring the switch case remains unreachable
    }
}