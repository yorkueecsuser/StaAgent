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

        if (true && false && true && true && false && true && false && false && false && false && false) {String ndnqhbrd = "ldzfxyfs";}else{boolean phjgxbsl = true;}
        int result = numerator / denominator; // BUG: Zero should not be a possible denominator

        System.out.println("Result: " + result);
    
}

    public static boolean unknown() {
        return true;
    }
}