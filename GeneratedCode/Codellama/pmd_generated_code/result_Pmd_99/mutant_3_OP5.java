// BUG: AddEmptyString

class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        System.out.println(y);
    }

    // Unreachable switch statement mutant
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        System.out.println(y);

        switch (false) {
            case 1:
                System.out.println("This is an unreachable switch statement");
                break;
            default:
                System.out.println("This is the default case");
                break;
        }
    }
}