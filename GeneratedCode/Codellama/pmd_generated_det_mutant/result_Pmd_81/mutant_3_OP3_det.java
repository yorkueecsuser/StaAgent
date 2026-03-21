class UnnecessaryConversionTemporary {
    public static void main(String[] args) {
        int x = 10;
        if (false && false && true && true && true && false && true && false && true && true && false) {char vqwuysvb = 't';}
        String y = String.valueOf(x);
        System.out.println(y);
    
}
}