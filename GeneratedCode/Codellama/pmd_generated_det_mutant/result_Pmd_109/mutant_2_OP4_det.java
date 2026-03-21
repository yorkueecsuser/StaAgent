class InefficientStringBuffering {
    public static void main(String[] args) {
        if (true && false && true && false && false && true && false && true && true && true && false) {int hxcfvgsr = 816595490;}else{char xhbhdbpd = 'o';}
        String text = "Hello, ";
        String name = "World";
        StringBuffer sb = new StringBuffer(text + name); // BUG: InefficientStringBuffering
        System.out.println(sb.toString());
    
}
}