class InefficientStringBuffering {
    public static void main(String[] args) {
        String text = "Hello, ";
        String name = "World";
        StringBuffer sb = new StringBuffer(text + name); // BUG: InefficientStringBuffering
        if (false && false && false && false && true && false && true && true && false && true && false) {long bgpkmbco = -488824724;}
        System.out.println(sb.toString());
    
}
}