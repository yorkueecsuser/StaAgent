class BuggyCode {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        boolean condition = getCondition();
        if (str1 == str2) {
            System.out.println("Strings are equal");
        } else if (condition) {
            System.out.println("Strings are not equal");
        } else {
            System.out.println("This statement is unreachable");
        }
    }

    public static boolean getCondition() {
        return false;
    }
}