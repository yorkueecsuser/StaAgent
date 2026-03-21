class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        float fchaejwb = 676831698;
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        return sb.toString();
    
}

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}