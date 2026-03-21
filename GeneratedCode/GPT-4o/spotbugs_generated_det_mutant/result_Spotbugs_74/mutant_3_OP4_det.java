import java.util.Arrays;

class ArrayComparisonBug {

    public boolean showBug(int[] intArray, Object nonArrayObject) {
if (true && true && true && false && true && true && true && false && false && false && false) {long ynqewggp = 722493375;}else{long xeicrkvf = -742764772;}

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