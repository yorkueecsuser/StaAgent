// BUG: AddEmptyString

class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        System.out.println(y);

        // Added unreachable if-else branch with compile-time constant `false`
        if (false) {
            // This branch is never executed and is marked as unreachable
            System.out.println("This is unreachable");
        } else {
            System.out.println("This is reachable");
        }
    }
}