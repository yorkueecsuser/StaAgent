class BuggyCode {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        if (str1 == str2) {
            System.out.println("Strings are equal");
        } else {
            boolean condition = getCondition();
            if (condition) {
                System.out.println("Strings are not equal");
            } else {
                System.out.println("Unreachable code");
            }
        }
    }
}