class ArrayEqualsBug {

    public boolean showBug(String[] array, String str) {
        return array.equals(str); // Bug: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
    }

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        String[] fruitArray = {"apple", "banana", "cherry"}; // Mutated variable name
        String str = "apple";
        boolean result = bug.showBug(fruitArray, str);
        System.out.println("Result: " + result);
    }
}