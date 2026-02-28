import java.util.Arrays;

class ArrayLoopBugDemo {

    public int[] showBug1(int[] source) {
        int[] destination = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i]; // BUG: AvoidArrayLoops
        }
        return destination;
    }

    // Mutant for showBug1
    public int[] showBug1Mutant(int[] x) {
        int[] y = new int[x.length];
        for (int z = 0; z < x.length; z++) {
            y[z] = x[z]; // BUG: AvoidArrayLoops
        }
        return y;
    }

    public int[] showBug2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1]; // BUG: AvoidArrayLoops
        }
        return array;
    }

    // Mutant for showBug2
    public int[] showBug2Mutant(int[] b) {
        for (int c = 0; c < b.length - 1; c++) {
            b[c] = b[c + 1]; // BUG: AvoidArrayLoops
        }
        return b;
    }

    public int[] showBug3(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1]; // BUG: AvoidArrayLoops
        }
        return array;
    }

    // Mutant for showBug3
    public int[] showBug3Mutant(int[] d) {
        for (int e = d.length - 1; e > 0; e--) {
            d[e] = d[e - 1]; // BUG: AvoidArrayLoops
        }
        return d;
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

        // Testing mutants
        int[] sourceMutant = {1, 2, 3, 4, 5};
        int[] dest1Mutant = demo.showBug1Mutant(sourceMutant);
        System.out.println("Mutant Copied Array: " + Arrays.toString(dest1Mutant));
        
        int[] array2Mutant = {1, 2, 3, 4, 5};
        int[] shiftedLeftMutant = demo.showBug2Mutant(array2Mutant);
        System.out.println("Mutant Shifted Left: " + Arrays.toString(shiftedLeftMutant));
        
        int[] array3Mutant = {1, 2, 3, 4, 5};
        int[] shiftedRightMutant = demo.showBug3Mutant(array3Mutant);
        System.out.println("Mutant Shifted Right: " + Arrays.toString(shiftedRightMutant));
    }
}