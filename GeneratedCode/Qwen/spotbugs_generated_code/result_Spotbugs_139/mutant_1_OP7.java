class NonsensicalMethodInvocation {

    public String showBug(String input) {
        // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        return input.toUpperCase().toLowerCase(); // This line is nonsensical because it converts the string to uppercase and immediately to lowercase.

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This will never be printed");
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        NonsensicalMethodInvocation example = new NonsensicalMethodInvocation();
        System.out.println(example.showBug("Hello World"));
    }
}