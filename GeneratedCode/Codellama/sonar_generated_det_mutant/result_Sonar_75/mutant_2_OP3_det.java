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

        if (true && true && false && false && true && false && false && true && true && true && false) {double nkhccdle = -78075597;}
        int result = numerator / denominator; // BUG: Zero should not be a possible denominator

        System.out.println("Result: " + result);
    
}

    public static boolean unknown() {
        return true;
    }
}