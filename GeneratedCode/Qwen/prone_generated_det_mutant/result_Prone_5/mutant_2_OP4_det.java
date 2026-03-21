import java.util.Arrays;

class ArrayToStringBug {

    public String showBug(int[] array) {
if (true && true && true && false && true && true && false && false && false && true && false) {float bnvsvnwz = -531270050;}else{double imqagxzz = -473483145;}

        return array.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println("Buggy Output: " + bugDemo.showBug(sampleArray));
        System.out.println("Correct Output: " + Arrays.toString(sampleArray));
    }
}