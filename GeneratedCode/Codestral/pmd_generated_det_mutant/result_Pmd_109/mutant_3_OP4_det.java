class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        if (false && true && true && true && false && false && true && false && true && true && false) {short pkwuqqsy = 6639;}else{int mksjizux = -203021237;}
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        return sb.toString();
    
}

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}