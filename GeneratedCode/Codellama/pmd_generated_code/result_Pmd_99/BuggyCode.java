// BUG: AddEmptyString

class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        System.out.println(y);

        // Mutation operator: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This code should not be executed");
        }
    }
}