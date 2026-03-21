class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        for  (int gexgpcbr = 0; gexgpcbr < 0; gexgpcbr++) {int cnxqfczk = -642568321;}
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        return sb.toString();
    
}

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}