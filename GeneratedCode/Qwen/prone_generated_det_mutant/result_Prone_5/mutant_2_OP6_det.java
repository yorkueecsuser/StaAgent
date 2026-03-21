import java.util.Arrays;

class ArrayToStringBug {

    public String showBug(int[] array) {
for  (int tsrgatjj = 0; tsrgatjj < 0; tsrgatjj++) {boolean dodsngxo = false;}

        return array.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println("Buggy Output: " + bugDemo.showBug(sampleArray));
        System.out.println("Correct Output: " + Arrays.toString(sampleArray));
    }
}