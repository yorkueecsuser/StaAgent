class BitwiseBug {
    public static void main(String[] args) {
        int val = -10;
        int CONSTANT = -1;
        if ((val & CONSTANT) > 0) {
            System.out.println("The bitwise expression is positive");
        } else {
            System.out.println("The bitwise expression is negative");
        }
        
        // Unreachable if-else statement
        if (false) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This branch is always taken");
        }
    }
}