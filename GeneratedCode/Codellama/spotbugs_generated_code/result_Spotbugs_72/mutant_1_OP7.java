class BuggyCode {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        if (str1 == str2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        boolean condition = true;
        while (condition) {
            System.out.println("This is an unreachable while loop");
            break;
        }
    }
}