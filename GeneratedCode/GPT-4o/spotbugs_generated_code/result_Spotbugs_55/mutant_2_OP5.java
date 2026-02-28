class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        
        if (input != null && input.isEmpty()) {
            result = "Input string is empty";
        }
        
        // Unreachable switch statement insertion
        int unreachableSwitchCondition = getConditionValue(); // Dynamically resolve condition
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This is unreachable code block 1");
                break;
            case 2:
                System.out.println("This is unreachable code block 2");
                break;
            default:
                System.out.println("Default case which is also unreachable");
                break;
        }

        // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        return result.toUpperCase(); // This line will throw a NullPointerException if input is null
    }

    private int getConditionValue() {
        return 3; // Return a value not covered by any case, making the switch block unreachable
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        // This will demonstrate the bug
        System.out.println(example.showBug(null));
    }
}