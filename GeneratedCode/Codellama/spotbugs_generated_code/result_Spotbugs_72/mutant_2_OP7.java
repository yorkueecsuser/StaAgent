class BuggyCode {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        if (str1 == str2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // Unreachable while loop mutant
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This code is unreachable");
        }
    }
}