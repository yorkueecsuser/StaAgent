class NonsensicalMethodInvocation {

    public String showBug(String input) {
        // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        return input.toUpperCase().toLowerCase(); // This line is nonsensical because it converts the string to uppercase and immediately to lowercase.

        // Mutant code: Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will always return false
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NonsensicalMethodInvocation example = new NonsensicalMethodInvocation();
        System.out.println(example.showBug("Hello World"));
    }
}