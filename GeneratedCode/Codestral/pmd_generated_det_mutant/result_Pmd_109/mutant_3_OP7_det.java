class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        boolean dplahthy = false;while (dplahthy && true && false && false && false && true && true && false && false && true && true && false) {boolean fwmgrwrp = true;}
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        return sb.toString();
    
}

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}