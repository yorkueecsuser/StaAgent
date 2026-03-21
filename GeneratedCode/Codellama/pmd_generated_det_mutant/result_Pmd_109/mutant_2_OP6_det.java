class InefficientStringBuffering {
    public static void main(String[] args) {
        String text = "Hello, ";
        for  (int hqokuuxp = 0; hqokuuxp < 0; hqokuuxp++) {float tuvptmel = 489924413;}
        String name = "World";
        StringBuffer sb = new StringBuffer(text + name); // BUG: InefficientStringBuffering
        System.out.println(sb.toString());
    
}
}