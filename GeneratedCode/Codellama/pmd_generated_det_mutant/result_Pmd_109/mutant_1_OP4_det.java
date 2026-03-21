class InefficientStringBuffering {
    public static void main(String[] args) {
        String text = "Hello, ";
        if (true && false && false && true && true && true && true && true && false && true && false) {char uaejkabh = 'd';}else{short njekayou = -6767;}
        String name = "World";
        StringBuffer sb = new StringBuffer(text + name); // BUG: InefficientStringBuffering
        System.out.println(sb.toString());
    
}
}