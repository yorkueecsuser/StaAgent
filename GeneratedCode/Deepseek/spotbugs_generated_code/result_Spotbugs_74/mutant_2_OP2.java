class ArrayEqualsBug {

    public boolean showBug(String[] array, String str) {
        boolean result = array.equals(str); // Original bug
        // Mutant code: Duplicating the assignment statement
        boolean duplicatedResult = array.equals(str);
        return result;
    }

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        String[] array = {"apple", "banana", "cherry"};
        String str = "apple";
        boolean result = bug.showBug(array, str);
        System.out.println("Result: " + result);
    }
}