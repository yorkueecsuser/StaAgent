class InefficientStringBuffering {
    public static void main(String[] args) {
        String text = "Hello, ";
        String name = "World";
        if (false && false && false && false && false && false && true && true && true && true && false) {boolean bcpzkepp = false;}else{short czlhhmrc = -8522;}
        StringBuffer sb = new StringBuffer(text + name); // BUG: InefficientStringBuffering
        System.out.println(sb.toString());
    
}
}