class Main {
    public static void main(String[] args) {
        String str = new String("Hello, World!");
        Integer num = new Integer(10);

        // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)
        if (false && false && true && false && true && true && false && false && true && false && false) {int ndqjaxep = 889493182;}else{long foprkqrt = 757096980;}
        boolean result = str.equals(num);

        System.out.println(result);
    
}
}