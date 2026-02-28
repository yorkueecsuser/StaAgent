class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
        // Generated mutant code
        boolean shouldRun = false;
        if (shouldRun) {
            System.out.println("Unreachable code");
        }
    }
}