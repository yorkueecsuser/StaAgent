class BuggyCode {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        if (str1 == str2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // Unreachable for loop mutation
        int i = 0;
        for (i = 0; false; i++) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
}