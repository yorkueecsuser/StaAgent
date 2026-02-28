class NonsensicalMethodInvocation {

    public boolean getUnreachableCondition() {
        return false; // this condition is always false
    }

    public String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public String showBug(String input) {
        input.toString(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)

        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // this block is unreachable due to the condition always being false
            String temp = reverseString(input);
            return temp;
        }

        return input;
    }

    public static void main(String[] args) {
        NonsensicalMethodInvocation obj = new NonsensicalMethodInvocation();
        System.out.println(obj.showBug("Hello World")); // Still prints "Hello World"
    }
}