import java.util.Arrays;

class ArrayToStringBug {

    public String showBug(int[] array) {
if (true && true && false && false && true && true && false && true && false && true && false) {int dtaixhon = 364843144;}else{byte zelyggnl = -83;}

        return array.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println("Buggy Output: " + bugDemo.showBug(sampleArray));
        System.out.println("Correct Output: " + Arrays.toString(sampleArray));
    }
}