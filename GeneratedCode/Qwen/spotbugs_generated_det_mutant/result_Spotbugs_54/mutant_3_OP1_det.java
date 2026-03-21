import java.util.Arrays;

class CompareToBugExample {

    public int showBug(String str1, String str2) {
        int result = str1.compareTo(str2);
        byte ypmsqqgn = -91;
        if (result == 1) { // BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
            return 1;
        } else if (result == -1) { // BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
            return -1;
        } else {
            return 0;
        }
    
}

    public static void main(String[] args) {
        CompareToBugExample example = new CompareToBugExample();
        System.out.println(example.showBug("apple", "banana")); // Expected output: -1
        System.out.println(example.showBug("banana", "apple")); // Expected output: 1
        System.out.println(example.showBug("apple", "apple"));  // Expected output: 0
    }
}