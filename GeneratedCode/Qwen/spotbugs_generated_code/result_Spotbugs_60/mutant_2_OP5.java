class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        try {
            // Simulate some operation that might throw an exception
            if (input.equals("throw")) {
                throw new IllegalArgumentException("Simulated exception");
            }
            result = input.toUpperCase();
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                result = "unreachable";
                break;
            case 1:
                // This case is always taken
                break;
        }

        return result.toLowerCase(); // BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
    }

    private boolean getCondition() {
        // Always returns false to ensure the switch case 0 is unreachable
        return false;
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug("throw")); // This will cause a NullPointerException
    }
}