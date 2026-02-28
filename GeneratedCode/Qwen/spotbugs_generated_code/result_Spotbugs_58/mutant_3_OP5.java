class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        try {
            // Simulate a condition that always throws an exception
            if (input.equals("test")) {
                throw new IllegalArgumentException("Simulated exception");
            }
            result = input.toUpperCase();
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
            // Intentionally not setting result to any value, so it remains null
        }
        
        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                result = "unreachable";
                break;
            case 1:
                // This case is always reached
                break;
        }
        
        return result.toLowerCase(); // BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
    }

    private boolean getCondition() {
        // This method returns false, making the switch statement's first case unreachable
        return false;
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        try {
            example.showBug("test");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}