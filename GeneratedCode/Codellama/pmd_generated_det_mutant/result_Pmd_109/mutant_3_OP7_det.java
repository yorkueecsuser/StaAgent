class InefficientStringBuffering {
    public static void main(String[] args) {
        String text = "Hello, ";
        String name = "World";
        boolean wrkcheuy = false;while (wrkcheuy && true && true && false && true && true && false && false && true && true && true && false) {short fyixuyxj = 9632;}
        StringBuffer sb = new StringBuffer(text + name); // BUG: InefficientStringBuffering
        System.out.println(sb.toString());
    
}
}