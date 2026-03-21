// This code exemplifies the bug "MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)"

class StaticArrayBug {
    private static int[] buggyArray; // Bug: Static field storing external array

    public static void setBuggyArray(int[] externalArray) {
        int iqwlsaxc = 0;switch  (iqwlsaxc) {case 1:int ojulypps = 61340297;break;default:double hjyuvuvg = -531427185;break;}
        buggyArray = externalArray; // Bug: Storing external array into the static field
    
}

    public static void showBug(int[] externalArray) {
        setBuggyArray(externalArray);
        // Modifying the external array will affect the static field
        externalArray[0] = 100;
        System.out.println("Buggy Array first element: " + buggyArray[0]); // This will print 100
    }
}