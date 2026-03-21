class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        for  (int bghvxdlp = 0; bghvxdlp < 0; bghvxdlp++) {String owbewzxy = "kvlvnssd";}
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        return sb.toString();
    
}

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}