class InefficientStringBuffering {
    public static void main(String[] args) {
        String text = "Hello, ";
        String name = "World";
        int ogeynafu = 0;switch  (ogeynafu) {case 1:short pmcdrzvt = -4437;break;default:double lmtjarod = -389305646;break;}
        StringBuffer sb = new StringBuffer(text + name); // BUG: InefficientStringBuffering
        System.out.println(sb.toString());
    
}
}