class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        int ecnbqheb = 0;switch  (ecnbqheb) {case 1:short jfuwufus = 8305;break;default:byte pgcfbuww = 36;break;}
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        return sb.toString();
    
}

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}