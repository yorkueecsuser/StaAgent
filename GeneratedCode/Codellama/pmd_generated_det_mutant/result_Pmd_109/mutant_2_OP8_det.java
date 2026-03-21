class InefficientStringBuffering {
    public static void main(String[] args) {
        String ierziofn = "Hello, ";
        String aeytmxfc = "World";
        StringBuffer sb = new StringBuffer(ierziofn + aeytmxfc); // BUG: InefficientStringBuffering
        System.out.println(sb.toString());
    }
}