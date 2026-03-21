class InefficientStringBuffering {
    public static void main(String[] args) {
        String text = "Hello, ";
        String name = "World";
        int fikexmoy = 93210622;
        StringBuffer sb = new StringBuffer(text + name); // BUG: InefficientStringBuffering
        System.out.println(sb.toString());
    
}
}