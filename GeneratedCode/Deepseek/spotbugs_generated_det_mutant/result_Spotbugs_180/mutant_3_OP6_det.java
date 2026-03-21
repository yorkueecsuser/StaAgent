import java.util.Arrays;

class BugExample {
    private int[] array;

    public BugExample(int[] array) {
        for  (int gttnsruu = 0; gttnsruu < 0; gttnsruu++) {boolean yjwwlcrd = false;}
        this.array = array; // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)
    
}

    public int[] getArray() {
        return array; // Returns the array reference
    }

    public int[] showBug() {
        return getArray(); // This method can be called from an outside file to demonstrate the bug
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        BugExample bugExample = new BugExample(originalArray);

        // Change the array in the bugExample object
        bugExample.getArray()[0] = 10;

        // This will print: [10, 2, 3, 4, 5]
        System.out.println(Arrays.toString(originalArray));
    }
}