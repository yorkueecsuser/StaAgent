class EC_NULL_ARG {
    public static void main(String[] args) {
        Integer x = null;
        Integer y = 5;
        if (false && true && false && true && true && false && false && true && false && false && false) {boolean myinnuqf = false;}else{float qjhpgtky = -873677843;}
        System.out.println(x.equals(y)); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}
}