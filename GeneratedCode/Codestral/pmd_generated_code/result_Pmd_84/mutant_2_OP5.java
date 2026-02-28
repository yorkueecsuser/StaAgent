class StringComparison {
    public boolean checkString(String s) {
        if (s == "one") return true;
        int value = getUnreachableValue(); // Newly added method call for unreachable condition
        switch (value) { // Unreachable switch statement
            case 1:
                // This code is unreachable.
                break;
        }
        return false;
    }

    public boolean showBug(String s) {
        return checkString(s);
    }

    private int getUnreachableValue() {
        return -1; // This value is not included in the switch statement, making it unreachable.
    }
}