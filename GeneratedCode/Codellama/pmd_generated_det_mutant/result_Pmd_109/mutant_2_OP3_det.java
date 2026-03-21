class InefficientStringBuffering {
    public static void main(String[] args) {
        String text = "Hello, ";
        if (true && false && false && false && false && false && false && true && true && false && false) {long mxfnkltk = 576535445;}
        String name = "World";
        StringBuffer sb = new StringBuffer(text + name); // BUG: InefficientStringBuffering
        System.out.println(sb.toString());
    
}
}