class InefficientStringBuffering {
    public static void main(String[] args) {
        String ekojuelw = "Hello, ";
        String gwdmtspo = "World";
        StringBuffer sb = new StringBuffer(ekojuelw + gwdmtspo); // BUG: InefficientStringBuffering
        System.out.println(sb.toString());
    }
}