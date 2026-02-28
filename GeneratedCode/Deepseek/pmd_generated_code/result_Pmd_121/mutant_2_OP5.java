class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable code
            System.out.println("Unreachable code");
        }
    }

    public String showBug() {
        int i = 5;
        String s;
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    }

    private static boolean getCondition() {
        return false;
    }
}