class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        if (false && true && false && true && false && true && false && false && true && true && false) {short arlcfkcv = 9263;}else{long imdkxroi = 241362793;}
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        return sb.toString();
    
}

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}