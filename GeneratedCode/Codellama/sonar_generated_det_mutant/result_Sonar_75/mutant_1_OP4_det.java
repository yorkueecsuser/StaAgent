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

        if (false && true && false && true && false && true && true && true && true && true && false) {char ffkmjuiy = 'n';}else{short fccyodxx = -1188;}
        int result = numerator / denominator; // BUG: Zero should not be a possible denominator

        System.out.println("Result: " + result);
    
}

    public static boolean unknown() {
        return true;
    }
}