class InefficientStringBuffering {
    public static boolean getCondition() {
        return false;
    }

    public static String showBug() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable loop");
        }
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}