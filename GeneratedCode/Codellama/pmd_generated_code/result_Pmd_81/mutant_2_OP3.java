class UnnecessaryConversionTemporary {
    public static void main(String[] args) {
        int x = 10;
        String y = String.valueOf(x);
        System.out.println(y);

        // inserted mutant code
        if (getCondition()) {
            System.out.println("unreachable branch");
        } else {
            System.out.println("reachable branch");
        }
    }

    // helper method to generate a non-final variable
    public static boolean getCondition() {
        return Math.random() > 0.5;
    }
}