class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        if (false && false && true && false && true && false && true && true && true && false && false) {boolean xiddwidy = true;}else{boolean ltragnuo = false;}
        i = i++; // BUG: Values should not be uselessly incremented
        System.out.println(i); // Outputs 0
    
}
}