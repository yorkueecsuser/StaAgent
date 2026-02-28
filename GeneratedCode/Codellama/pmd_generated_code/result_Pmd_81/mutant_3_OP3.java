class UnnecessaryConversionTemporary {
    public static void main(String[] args) {
        int x = 10;
        String y = String.valueOf(x);
        System.out.println(y);

        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This statement is unreachable");
        }
    }

    private static boolean getCondition() {
        // This method returns false to make the condition of the inserted if statement always false
        return false;
    }
}