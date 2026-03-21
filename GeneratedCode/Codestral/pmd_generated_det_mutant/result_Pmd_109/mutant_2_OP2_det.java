class InefficientStringBuffering {
public static String showBug() {
    StringBuffer sb = new StringBuffer("tmp = " + System.getProperty("java.io.tmpdir"));
    sb = new StringBuffer("tmp = " + System.getProperty("java.io.tmpdir"));
    return sb.toString();
}

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}