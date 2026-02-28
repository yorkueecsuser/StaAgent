class StringComparison {
    private int getValue() {
        return 0;  // This method always returns 0, ensuring the switch statement is unreachable
    }

    public boolean checkString(String s) {
        if (s == "one") return true;

        // Mutant code: Unreachable switch statement
        int value = getValue();
        switch(value) {
            case 1:
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }

        return false;
    }

    public boolean showBug(String s) {
        return checkString(s);
    }
}