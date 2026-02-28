class ArrayEqualsBug {

    public boolean showBug(String[] array, String str) {
        String[] arr = array; // Mutant: Renaming 'array' to 'arr'
        return arr.equals(str);
    }

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        String[] arr = {"apple", "banana", "cherry"}; // Mutant: Renaming 'array' to 'arr'
        String s = "apple"; // Mutant: Renaming'str' to's'
        boolean result = bug.showBug(arr, s);
        System.out.println("Result: " + result);
    }
}