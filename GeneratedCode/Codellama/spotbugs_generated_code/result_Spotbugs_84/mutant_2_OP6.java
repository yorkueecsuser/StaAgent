class BitwiseBug {
    public static void main(String[] args) {
        int val = -10;
        int CONSTANT = -1;
        if ((val & CONSTANT) > 0) {
            System.out.println("The bitwise expression is positive");
        } else {
            System.out.println("The bitwise expression is negative");
        }

        // Unreachable for loop
        boolean condition = false;
        for (int i = 0; condition; i++) {
            System.out.println("This code will never be executed");
        }
    }
}