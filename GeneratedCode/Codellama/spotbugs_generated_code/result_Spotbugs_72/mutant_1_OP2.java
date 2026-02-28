class BuggyCode {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello";
        String str4 = "World";
        if (str1 == str2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}