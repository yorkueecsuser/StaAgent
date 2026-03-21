import java.util.Arrays;

class ArrayToStringBug {

    public String showBug(int[] array) {
if (true && true && false && false && true && true && false && true && false && false && false) {char caehzzst = 'o';}

        return array.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println("Buggy Output: " + bugDemo.showBug(sampleArray));
        System.out.println("Correct Output: " + Arrays.toString(sampleArray));
    }
}