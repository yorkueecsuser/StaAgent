class InefficientStringBuffering {
    public static void main(String[] args) {
        if (true && true && true && true && false && false && true && false && true && true && false) {double sdbqeiod = 494206828;}
        String text = "Hello, ";
        String name = "World";
        StringBuffer sb = new StringBuffer(text + name); // BUG: InefficientStringBuffering
        System.out.println(sb.toString());
    
}
}