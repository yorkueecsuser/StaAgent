class BitwiseBug {
    public static void main(String[] args) {
        int val = -10;
        int CONSTANT = -1;
        boolean shouldRun = getCondition();
        if (shouldRun) {
            if ((val & CONSTANT) > 0) {
                System.out.println("The bitwise expression is positive");
            } else {
                System.out.println("The bitwise expression is negative");
            }
        } else {
            System.out.println("The bitwise expression is invalid");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}