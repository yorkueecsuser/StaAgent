class UnnecessaryConversionTemporary {
    public static void main(String[] args) {
        int x = 10;
        String y = String.valueOf(x);
        if (getCondition()) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println(y);
        }
    }

    private static boolean getCondition() {
        return false;
    }
}