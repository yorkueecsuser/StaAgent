class MutationTarget {
    public static void main(String[] args) {
        int x = 10;
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will return false
        }

        if (x > 5) {
            System.out.println("Big");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}