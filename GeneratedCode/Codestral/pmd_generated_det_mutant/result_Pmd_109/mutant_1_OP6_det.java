class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        for  (int ouejouqv = 0; ouejouqv < 0; ouejouqv++) {byte yaztihkz = 57;}
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        return sb.toString();
    
}

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}