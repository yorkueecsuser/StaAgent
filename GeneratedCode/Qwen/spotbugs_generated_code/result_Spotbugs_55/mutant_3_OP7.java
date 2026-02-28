class NullPointerExample {

    public void showBug() {
        String str = null;
        
        // Introduced an unreachable while loop according to the mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This loop is unreachable");
        }
        
        int length = str.length(); // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
    }

    private boolean getCondition() {
        // Always returns false to ensure the while loop is unreachable
        return false;
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        try {
            example.showBug();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}