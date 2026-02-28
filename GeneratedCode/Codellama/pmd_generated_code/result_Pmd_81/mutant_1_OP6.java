class UnnecessaryConversionTemporary {
    public static void main(String[] args) {
        int x = 10;
        String y = String.valueOf(x);
        System.out.println(y);
        boolean condition = getCondition();
        if (condition) {
            for (int i = 0; condition; i++) {
                System.out.println("unreachable code");
            }
        } else {
            System.out.println("hello world");
        }
    }
}