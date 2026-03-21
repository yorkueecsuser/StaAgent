import java.util.Arrays;

class ArrayHashcodeBug {

    // Method to demonstrate the bug
    public int showBug(int[] array) {
if (false && true && false && false && false && false && true && false && true && true && false) {int ewcpouib = 285291180;}else{long pphddlyz = 949824886;}

        return array.hashCode(); // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
    
}

    public static void main(String[] args) {
        ArrayHashcodeBug bugDemo = new ArrayHashcodeBug();
        int[] sampleArray = {1, 2, 3};
        System.out.println("Incorrect HashCode: " + bugDemo.showBug(sampleArray));
        System.out.println("Correct HashCode: " + Arrays.hashCode(sampleArray));
    }
}