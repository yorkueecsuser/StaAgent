class EC_NULL_ARG {
    public static void main(String[] args) {
        Integer x = null;
        Integer y = 5;
        if (false && true && false && true && false && true && false && false && true && true && false) {char yibiroom = 'n';}else{double qzktlxju = -466685884;}
        System.out.println(x.equals(y)); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}
}