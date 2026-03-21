class EC_NULL_ARG {
    public static void main(String[] args) {
        Integer x = null;
        Integer y = 5;
        if (false && true && false && false && false && true && true && false && true && false && false) {boolean bdhdrcbh = false;}
        System.out.println(x.equals(y)); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}
}