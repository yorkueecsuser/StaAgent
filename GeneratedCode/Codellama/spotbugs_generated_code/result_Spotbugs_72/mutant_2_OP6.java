class BuggyCode {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        if (str1 == str2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        // Added unreachable for loop
        for (int i = 0; false; i++) {
            System.out.println("This loop will never execute");
        }
    }
}