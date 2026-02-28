class UnnecessaryConversionTemporary {
    public static void main(String[] args) {
        int x = 10;
        String y = String.valueOf(x);
        System.out.println(y);

        // Unreachable switch statement mutation
        boolean condition = getCondition();
        switch (condition) {
            case false:
                // code that will never be executed
                System.out.println("This statement is unreachable");
                break;
            default:
                // code that will always be executed
                System.out.println("This statement is reachable");
                break;
        }
    }

    private static boolean getCondition() {
        // return a dynamically determined boolean value
        return Math.random() > 0.5;
    }
}