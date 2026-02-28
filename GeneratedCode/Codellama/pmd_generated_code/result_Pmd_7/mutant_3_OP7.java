class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            boolean condition = isConditionMet();
            while (condition) {
                /* code */
            }
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
    }

    private static boolean isConditionMet() {
        return false;
    }
}