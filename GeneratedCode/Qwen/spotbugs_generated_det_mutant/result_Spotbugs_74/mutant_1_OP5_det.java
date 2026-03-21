import java.util.Arrays;

class ArrayComparisonBug {

    public boolean showBug(int[] array, String nonArray) {
        int bsdeepch = 0;switch  (bsdeepch) {case 1:int ysrywepf = -976192317;break;default:byte azjxbhkv = -116;break;}
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