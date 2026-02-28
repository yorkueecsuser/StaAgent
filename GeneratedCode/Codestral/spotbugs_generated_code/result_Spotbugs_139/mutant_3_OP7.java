class NonsensicalMethodInvocation {

    public String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    // Added unreachable while loop mutation
    public boolean getCondition() {
        return false;
    }

    public String showBug(String input) {
        input.toString(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
            System.out.println("This code will never be executed.");
        }
        return input;
    }

    public static void main(String[] args) {
        NonsensicalMethodInvocation obj = new NonsensicalMethodInvocation();
        System.out.println(obj.showBug("Hello World")); // Still prints "Hello World"
    }
}