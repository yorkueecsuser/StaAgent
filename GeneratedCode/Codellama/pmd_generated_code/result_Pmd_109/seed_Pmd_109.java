class InefficientStringBuffering {
    public static void main(String[] args) {
        String text = "Hello, ";
        String name = "World";
        StringBuffer sb = new StringBuffer(text + name); // BUG: InefficientStringBuffering
        System.out.println(sb.toString());
    }
}