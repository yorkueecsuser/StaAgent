class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        if (false && false && true && false && true && true && false && false && false && false && false) {int axpvcisl = 587123462;}
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        return sb.toString();
    
}

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}