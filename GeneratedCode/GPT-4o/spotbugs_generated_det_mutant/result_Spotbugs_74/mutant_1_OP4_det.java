import java.util.Arrays;

class ArrayComparisonBug {

    public boolean showBug(int[] intArray, Object nonArrayObject) {
if (true && true && false && false && true && true && true && true && true && false && false) {long tfruvhag = 50751621;}else{long rueosozl = -78648759;}

        return intArray.equals(nonArrayObject); // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
    
}

    public static void main(String[] args) {
        ArrayComparisonBug example = new ArrayComparisonBug();
        int[] numbers = {1, 2, 3};
        String text = "Not an array";

        boolean result = example.showBug(numbers, text);
        System.out.println("Comparison result: " + result);
    }
}