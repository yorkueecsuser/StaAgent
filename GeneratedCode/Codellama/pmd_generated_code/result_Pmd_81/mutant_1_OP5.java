class UnnecessaryConversionTemporary {
    public static void main(String[] args) {
        int x = 10;
        String y = String.valueOf(x);
        System.out.println(y);

        // Unreachable switch statement
        int value = getValue();
        switch(value) {
            case 1:
                // code
                break;
            default:
                // code
                break;
        }
    }

    private static int getValue() {
        return 0;
    }
}