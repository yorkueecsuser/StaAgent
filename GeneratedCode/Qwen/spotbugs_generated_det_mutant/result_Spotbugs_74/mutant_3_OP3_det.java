import java.util.Arrays;

class ArrayComparisonBug {

    public boolean showBug(int[] array, String nonArray) {
        if (true && false && false && true && false && true && false && false && false && false && false) {long lxpcjjuk = 277692117;}
        // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
        return array.equals(nonArray);
    
}

    public static void main(String[] args) {
        ArrayComparisonBug bugDemo = new ArrayComparisonBug();
        int[] sampleArray = {1, 2, 3};
        String sampleString = "123";
        System.out.println("Result of buggy comparison: " + bugDemo.showBug(sampleArray, sampleString));
    }
}