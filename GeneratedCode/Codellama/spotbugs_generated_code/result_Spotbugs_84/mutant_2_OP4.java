class BitwiseBug {
    public static void main(String[] args) {
        int val = -10;
        int CONSTANT = -1;
        if ((val & CONSTANT) > 0) {
            System.out.println("The bitwise expression is positive");
        } else {
            System.out.println("The bitwise expression is negative");
        }

        // MUTATION OPERATOR APPLIED: Unreachable If-Else Statement
        if (false) {
            System.out.println("This is an unreachable if-else branch");
        } else {
            System.out.println("This is an unreachable if-else branch");
        }
    }
}