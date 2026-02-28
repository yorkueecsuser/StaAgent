class BitwiseBug {
    public static void main(String[] args) {
        int val = -10;
        int CONSTANT = -1;
        if ((val & CONSTANT) > 0) {
            System.out.println("The bitwise expression is positive");
        } else {
            System.out.println("The bitwise expression is negative");
        }

        // Mutant code
        switch (0) {
            case 1:
                System.out.println("This statement is unreachable");
                break;
            default:
                System.out.println("Default statement");
                break;
        }
    }
}