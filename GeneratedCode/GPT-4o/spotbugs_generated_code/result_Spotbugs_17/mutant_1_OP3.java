class NullCheckExample {

    public String concatenateStrings(String str1, String str2) {
        boolean condition = isConditionFalse();
        if (condition) { // This if statement is unreachable because condition is always false
            System.out.println("This code is unreachable");
        }
        return str1.concat(str2); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
    }

    private boolean isConditionFalse() {
        return false; // Non-final method that always returns false
    }

    public String showBug(String str1, String str2) {
        // This will throw a NullPointerException if either str1 or str2 is null
        return concatenateStrings(str1, str2);
    }

    public static void main(String[] args) {
        NullCheckExample example = new NullCheckExample();
        
        // Uncommenting the next line will demonstrate the bug by throwing a NullPointerException
        // System.out.println(example.showBug(null, "world!"));
    }
}