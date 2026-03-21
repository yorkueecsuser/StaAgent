class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        if (true && false && false && true && false && true && false && true && true && false && false) {double iibbnebo = 388609342;}
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        return sb.toString();
    
}

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}