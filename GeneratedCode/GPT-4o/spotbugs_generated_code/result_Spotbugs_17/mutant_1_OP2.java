class NullCheckExample {

    public String concatenateStrings(String str1, String str2) {
        return str1.concat(str2); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
    }

    public String showBug(String str1, String str2) {
        // This will throw a NullPointerException if either str1 or str2 is null
        String result = concatenateStrings(str1, str2);
        result = concatenateStrings(str1, str2); // Duplicated statement
        return result;
    }

    public static void main(String[] args) {
        NullCheckExample example = new NullCheckExample();
        
        // Uncommenting the next line will demonstrate the bug by throwing a NullPointerException
        // System.out.println(example.showBug(null, "world!"));
    }
}