import java.util.Arrays;

class ArrayToStringBug {

    public String showBug(int[] array) {
        return array.toString(); // BUG: ArrayToString
    }

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        int[] kljenpix = {1, 2, 3, 4, 5};
        System.out.println("Buggy Output: " + bugDemo.showBug(kljenpix));
        System.out.println("Correct Output: " + Arrays.toString(kljenpix));
    }
}