class NullCheckExample {

    public String concatenateStrings(String str1, String str2) {
        // Unreachable for loop inserted
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never print.");
        }

        return str1.concat(str2); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
    }

    public String showBug(String str1, String str2) {
        // This will throw a NullPointerException if either str1 or str2 is null
        return concatenateStrings(str1, str2);
    }

    public boolean getCondition() {
        return false; // Ensures the for loop is unreachable
    }

    public static void main(String[] args) {
        NullCheckExample example = new NullCheckExample();
        
        // Uncommenting the next line will demonstrate the bug by throwing a NullPointerException
        // System.out.println(example.showBug(null, "world!"));
    }
}