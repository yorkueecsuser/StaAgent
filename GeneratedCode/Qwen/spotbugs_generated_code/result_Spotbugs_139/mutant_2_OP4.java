class NonsensicalMethodInvocation {

    public String showBug(String input) {
        // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        return input.toUpperCase().toLowerCase(); // This line is nonsensical because it converts the string to uppercase and immediately to lowercase.

        // Mutated code with an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This will never be printed");
        } else {
            System.out.println("This will also never be printed");
        }
    }

    private boolean getCondition() {
        return false; // This method returns false, making the if-else block unreachable
    }

    public static void main(String[] args) {
        NonsensicalMethodInvocation example = new NonsensicalMethodInvocation();
        System.out.println(example.showBug("Hello World"));
    }
}