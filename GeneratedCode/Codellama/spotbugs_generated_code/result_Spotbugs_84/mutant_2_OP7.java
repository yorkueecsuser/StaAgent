class BitwiseBug {
    public static void main(String[] args) {
        int val = -10;
        int CONSTANT = -1;
        if ((val & CONSTANT) > 0) {
            System.out.println("The bitwise expression is positive");
        } else {
            System.out.println("The bitwise expression is negative");
        }

        // Unreachable while loop
        while (false) {
            // Code here will never be executed
            System.out.println("This is an unreachable while loop");
        }
    }
}