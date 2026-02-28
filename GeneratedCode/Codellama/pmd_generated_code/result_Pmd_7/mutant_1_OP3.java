class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            if (getCondition()) { // Unreachable if statement
                System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
            }
        }
    }

    private static boolean getCondition() {
        // Dynamically determine the condition at runtime
        return Math.random() > 0.5;
    }
}