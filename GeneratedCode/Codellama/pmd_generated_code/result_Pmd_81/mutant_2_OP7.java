class UnnecessaryConversionTemporary {
    public static void main(String[] args) {
        int x = 10;
        String y = String.valueOf(x);
        System.out.println(y);
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This while loop is unreachable because the condition is always false
        }
    }
}