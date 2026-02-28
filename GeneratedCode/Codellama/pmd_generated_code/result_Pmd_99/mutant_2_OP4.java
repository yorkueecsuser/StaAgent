// BUG: AddEmptyString

class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        System.out.println(y);
        // Add unreachable if-else statement
        if (false) {
            // Unreachable code
            System.out.println("Unreachable code");
        } else {
            // Reachable code
            System.out.println("Reachable code");
        }
    }
}