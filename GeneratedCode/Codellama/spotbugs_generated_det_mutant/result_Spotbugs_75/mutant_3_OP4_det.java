class EC_NULL_ARG {
    public static void main(String[] args) {
        Integer x = null;
        Integer y = 5;
        if (true && true && false && true && false && true && true && true && false && true && false) {double wlatpbqk = 864684076;}else{String rfzknprl = "xvqubfvn";}
        System.out.println(x.equals(y)); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}
}