class UnnecessaryConversionTemporary {
    public static void main(String[] args) {
        int x = 10;
        String y = String.valueOf(x);
        System.out.println(y);
        boolean isTrue = getCondition();
        while (isTrue) {
            // Unreachable while loop
        }
    }

    private static boolean getCondition() {
        return false;
    }
}