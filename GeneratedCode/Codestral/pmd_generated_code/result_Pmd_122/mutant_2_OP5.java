class StringConcatenationBug {

    // Method to demonstrate the bug
    public String showBug() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            result += getStringFromSomeWhere(i);

            // Mutant: Insert an unreachable switch statement
            boolean shouldRunSwitch = getSwitchCondition();
            if (shouldRunSwitch) {
                int value = getValue();
                switch(value) {
                    case 1:
                        // This case is unreachable
                        System.out.println("Unreachable case 1");
                        break;
                    case 2:
                        // This case is unreachable
                        System.out.println("Unreachable case 2");
                        break;
                }
            }
        }
        return result;
    }

    // Method to retrieve a string
    private String getStringFromSomeWhere(int i) {
        return "String" + i;
    }

    // Method to determine whether to run the switch statement
    private boolean getSwitchCondition() {
        // This method always returns false, making the switch statement unreachable
        return false;
    }

    // Method to retrieve a value for the switch statement
    private int getValue() {
        // This method returns a value that is not covered by any case in the switch statement
        return 0;
    }
}