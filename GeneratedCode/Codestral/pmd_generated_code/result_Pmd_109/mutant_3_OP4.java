class InefficientStringBuffering {
    public static boolean getUnreachableCondition() {
        return false;
    }

    public static String showBug() {
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code
            sb.append("This code is unreachable");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}