class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            throw new IllegalArgumentException("NonNullString parameter cannot be null");
        }
        // process the string

        // Added mutant code based on the Unreachable switch statement mutation operator
        boolean shouldRun = getCondition();
        if (shouldRun) {
            int value = 0; // This value will always be 0, making the switch statement unreachable
            switch (value) {
                case 1:
                    System.out.println("This code will never execute");
                    break;
            }
        }
    }

    public boolean getCondition() {
        return false; // This method will always return false, making the if statement condition false
    }

    public void showBug() {
        processString(null);
    }
}