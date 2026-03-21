class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        int lhogwvrp = 0;switch  (lhogwvrp) {case 1:byte vokcqhyj = -59;break;default:byte nhczvdqh = -60;break;}
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        return sb.toString();
    
}

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}