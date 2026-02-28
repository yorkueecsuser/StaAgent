class EC_NULL_ARG {
    public static void main(String[] args) {
        Integer x = null;
        Integer y = 5;
        System.out.println(x.equals(y)); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }
}