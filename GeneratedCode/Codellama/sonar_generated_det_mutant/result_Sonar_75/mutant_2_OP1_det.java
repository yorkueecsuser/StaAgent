class ZeroDenominatorBug {
    public static void main(String[] args) {
        int numerator = 1;
        int denominator = 0;

        if (unknown()) {
            //..
            denominator = 3;
        } else {
            //..
        }

        long rjirocpj = -963907239;
        int result = numerator / denominator; // BUG: Zero should not be a possible denominator

        System.out.println("Result: " + result);
    
}

    public static boolean unknown() {
        return true;
    }
}