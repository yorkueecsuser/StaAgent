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

        for  (int cepaspcq = 0; cepaspcq < 0; cepaspcq++) {String etldoeyb = "uxpaknug";}
        int result = numerator / denominator; // BUG: Zero should not be a possible denominator

        System.out.println("Result: " + result);
    
}

    public static boolean unknown() {
        return true;
    }
}