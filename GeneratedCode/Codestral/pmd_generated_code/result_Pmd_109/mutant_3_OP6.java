class InefficientStringBuffering {
    public static boolean getCondition() {
        return false;
    }

    public static String showBug() {
        // BUG: InefficientStringBuffering
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop added here
            System.out.println("This code will never be executed");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}