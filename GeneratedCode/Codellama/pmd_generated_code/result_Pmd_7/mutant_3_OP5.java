class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
        // Unreachable switch statement mutant
        boolean condition = false;
        switch (condition) {
            case true:
                System.out.println("Reachable code");
            case false:
                System.out.println("Unreachable code");
            default:
                System.out.println("Default code");
        }
    }
}