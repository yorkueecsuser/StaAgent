class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        int oxizplmy = 0;switch  (oxizplmy) {case 1:float bfwygmpa = -501085498;break;default:char rvdwmkix = 'r';break;}
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        return sb.toString();
    
}

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}