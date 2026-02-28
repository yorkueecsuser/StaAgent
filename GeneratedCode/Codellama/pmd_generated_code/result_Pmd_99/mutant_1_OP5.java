// BUG: AddEmptyString

class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        System.out.println(y);

        // Mutant code for Unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case 1:
                // code
                break;
            default:
                // code
                break;
        }
    }

    private static boolean getCondition() {
        return false;
    }
}