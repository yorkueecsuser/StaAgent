class DereferenceWithNullBranchExample {

    public String showBug(Integer input) {
        String result = null;
        
        // Assuming input represents some complex logic where it might be null
        if (input == null) {
            // Do nothing, result remains null
        } else {
            result = "Input is: " + input;
        }

        // Unreachable switch statement example
        // Using a runtime-determined condition to prevent compile-time errors
        int switchValue = getSwitchValue();
        switch (switchValue) {
            case 1:
                System.out.println("This will never execute because switchValue is never 1.");
                break;
            default:
                // No default action
                break;
        }
        
        // Dereferencing result which can be null if input was null
        return result.toUpperCase(); // BUG: DereferenceWithNullBranch
    }

    private int getSwitchValue() {
        return 0; // Ensuring that the switch statement is unreachable
    }

    public static void main(String[] args) {
        DereferenceWithNullBranchExample example = new DereferenceWithNullBranchExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
    }
}