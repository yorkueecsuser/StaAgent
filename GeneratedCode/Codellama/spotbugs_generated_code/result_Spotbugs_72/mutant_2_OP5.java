class BuggyCodeWithMutation {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        if (str1 == str2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // Unreachable switch statement mutation
        switch (false) {
            case 1:
                System.out.println("Statement 1");
                break;
            case 2:
                System.out.println("Statement 2");
                break;
            default:
                System.out.println("Default statement");
        }
    }
}