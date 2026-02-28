class NonNullParameterBug {
    public String processString(String input) {
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This code is unreachable
                System.out.println("Unreachable code");
                break;
        }
        return input.toUpperCase(); // Original bug is still present
    }

    private int getUnreachableValue() {
        return -1; // This value will never be 1
    }

    public String showBug() {
        return processString(null);
    }
}