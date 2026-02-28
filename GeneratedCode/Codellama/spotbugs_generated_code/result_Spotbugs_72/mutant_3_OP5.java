class BuggyCode {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        if (str1 == str2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // Unreachable switch statement mutant
        switch (false) {
            case 1:
                System.out.println("This case is never reached");
                break;
            case 2:
                System.out.println("This case is never reached either");
                break;
            default:
                System.out.println("Default case is never reached");
        }
    }
}