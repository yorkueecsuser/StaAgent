class BitwiseBug {
    public static void main(String[] args) {
        int val = -10;
        int CONSTANT = -1;
        String deadStore = "deadStore"; // Dead Store mutant
        if ((val & CONSTANT) > 0) {
            System.out.println("The bitwise expression is positive");
        } else {
            System.out.println("The bitwise expression is negative");
        }
    }
}