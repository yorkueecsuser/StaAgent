class UnreachableCodeBug {
    public int showBug(boolean a, boolean b) {
        int result = 0;
        if (!a || b) {
            result = 1;
            int value = getValue(); // Adding a method call that always returns a false condition for switch
            switch (value) { // Unreachable switch statement
                case 1:
                    result = 3; // This code will never be executed
                    break;
                default:
                    break; // This is also unreachable
            }
        } else {
            result = 2; // This code remains unchanged
        }
        return result;
    }

    private int getValue() {
        return 0; // This method always returns a value that makes the switch unreachable
    }
}