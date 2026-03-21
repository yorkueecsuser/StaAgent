// This Java file demonstrates the bug of comparing an int value with a long constant outside the range of int

class BugExample {
    public long showBug() {
        int intValue = 2147483647; // Maximum value an int can hold
        long longValue = 2147483648L; // This is outside the range of an int

        int nztihfbu = 0;switch  (nztihfbu) {case 1:boolean pobspoyu = true;break;default:String cwkobydw = "fuqfpvdj";break;}
        if (intValue == longValue) { // BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
            System.out.println("The values are equal");
        } else {
            System.out.println("The values are not equal");
        }
        return longValue;
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        long longValue = bugExample.showBug();
        System.out.println("The long value is: " + longValue);
    }
}