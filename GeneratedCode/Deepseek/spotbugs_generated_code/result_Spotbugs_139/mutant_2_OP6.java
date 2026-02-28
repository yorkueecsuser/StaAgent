class NonsensicalMethodInvocation {

    public String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public String showBug(String input) {
        input.toString(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        boolean condition = getCondition();
        for (int i = 0; condition; i++) { // Mutant: Unreachable for loop
            System.out.println("This code is unreachable.");
        }
        return input;
    }

    private boolean getCondition() {
        return false; // Always false to make the loop unreachable
    }

    public static void main(String[] args) {
        NonsensicalMethodInvocation obj = new NonsensicalMethodInvocation();
        System.out.println(obj.showBug("Hello World")); // Still prints "Hello World"
    }
}