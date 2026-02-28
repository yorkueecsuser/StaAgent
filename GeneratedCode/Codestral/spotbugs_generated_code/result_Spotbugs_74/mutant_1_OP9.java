class ArrayEqualsBug {

    public boolean showBug(String[] array, String str) {
        int i = 0;
        do {
            if (array[i].equals(str)) {
                return true;
            }
            i++;
        } while (i < array.length);
        return false;
        // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
    }

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        String[] array = {"apple", "banana", "cherry"};
        String str = "apple";
        boolean result = bug.showBug(array, str);
        System.out.println("Result: " + result);
    }
}