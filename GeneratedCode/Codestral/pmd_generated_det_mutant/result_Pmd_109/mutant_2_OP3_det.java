class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        if (false && true && true && false && false && false && true && false && true && true && false) {boolean dsoiaums = false;}
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        return sb.toString();
    
}

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}