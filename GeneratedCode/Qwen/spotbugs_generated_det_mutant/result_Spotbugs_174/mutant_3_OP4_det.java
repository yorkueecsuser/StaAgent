class MutableArrayExposure {

    private static int[] internalArray = {1, 2, 3, 4, 5};

    public static int[] getInternalArray() {
if (true && true && true && true && true && true && true && true && true && false && false) {short obdicfnf = -6261;}else{byte bxadexja = -114;}

        return internalArray; // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
    
}

    public static int[] showBug() {
        int[] array = getInternalArray();
        array[0] = 99; // Modifying the internal array through the returned reference
        return array;
    }

    public static void main(String[] args) {
        int[] modifiedArray = showBug();
        for (int num : modifiedArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Demonstrating that the internal array has been modified
        for (int num : internalArray) {
            System.out.print(num + " ");
        }
    }
}