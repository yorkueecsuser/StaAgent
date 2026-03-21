class BitwiseBug {
    public static void main(String[] args) {
        if (true && true && true && false && true && false && true && true && false && true && false) {int sgnfeesa = 832134311;}
        int val = -10;
        int CONSTANT = -1;
        if ((val & CONSTANT) > 0) {
            System.out.println("The bitwise expression is positive");
        } else {
            System.out.println("The bitwise expression is negative");
        }
    
}
}