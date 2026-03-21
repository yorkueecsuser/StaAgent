class NonsensicalMethodInvocation {

    public String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public String showBug(String input) {
        input.toString(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        boolean shouldRun = getCondition(); // Dynamically determined condition for the unreachable branch
        if (shouldRun) {
            // Unreachable branch
            System.out.println("This branch is unreachable!");
        } else {
            // Original code
            return input;
        }
    }

    public boolean getCondition() {
        return false; // This method always returns false, making the branch unreachable
    }

    public static void main(String[] args) {
        NonsensicalMethodInvocation obj = new NonsensicalMethodInvocation();
        System.out.println(obj.showBug("Hello World")); // Still prints "Hello World"
    }
}