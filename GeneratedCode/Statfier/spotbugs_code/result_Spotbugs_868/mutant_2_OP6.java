class MutationTarget {
    public static void main(String[] args) {
        int x = 10;
        if (x > 5) {
            System.out.println("Big");
        }

        // Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() always returns false
        }
    }

    private static boolean getCondition() {
        return false;
    }
}