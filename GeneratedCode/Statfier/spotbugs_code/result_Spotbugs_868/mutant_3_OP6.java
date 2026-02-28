class MutationTarget {
    public static void main(String[] args) {
        int x = 10;
        if (x > 5) {
            System.out.println("Big");
        }

        // Introduced unreachable for loop according to the mutation operator
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() will return false
        }
    }

    private static boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }
}