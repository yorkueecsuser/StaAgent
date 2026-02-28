// BUG: AddEmptyString

class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        System.out.println(y);

        // Unreachable for loop
        for (int i = 0; false; i++) {
            // Unreachable code
            System.out.println("This code will never be executed!");
        }
    }
}