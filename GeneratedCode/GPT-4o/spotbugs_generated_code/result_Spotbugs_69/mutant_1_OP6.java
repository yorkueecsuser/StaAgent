class RedundantNullCheckExample {

    public String showBug(String input) {
        // Unreachable for loop added
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This for loop is unreachable.");
        }

        // Dereferencing input
        int length = input.length();
        
        // Redundant null check after dereference
        if (input != null) { // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
            return "Input string length is: " + length;
        } else {
            return "Input was null";
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RedundantNullCheckExample example = new RedundantNullCheckExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
        System.out.println(example.showBug("Hello"));
    }
}