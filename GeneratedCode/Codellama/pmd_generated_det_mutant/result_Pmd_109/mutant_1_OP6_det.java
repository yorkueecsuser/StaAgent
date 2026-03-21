class InefficientStringBuffering {
    public static void main(String[] args) {
        String text = "Hello, ";
        for  (int xuhmnxkx = 0; xuhmnxkx < 0; xuhmnxkx++) {char ixeysnom = 'b';}
        String name = "World";
        StringBuffer sb = new StringBuffer(text + name); // BUG: InefficientStringBuffering
        System.out.println(sb.toString());
    
}
}