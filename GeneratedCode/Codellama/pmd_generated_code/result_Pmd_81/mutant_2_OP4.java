class UnnecessaryConversionTemporary {
    public static void main(String[] args) {
        int x = 10;
        String y = String.valueOf(x);
        boolean condition = getCondition();
        if (condition) {
            System.out.println(y);
        } else {
            System.out.println("Unreachable code");
        }
    }

    public static boolean getCondition() {
        return false;
    }
}