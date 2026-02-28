class BuggyCode {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        if (str1 == str2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // Unreachable if statement
        boolean flag = getCondition();
        if (flag) {
            System.out.println("This message will never be printed");
        }
    }
}

private boolean getCondition() {
    return false;
}