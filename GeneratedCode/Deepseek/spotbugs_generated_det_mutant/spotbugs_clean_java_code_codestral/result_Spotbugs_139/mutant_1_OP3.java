class NonsensicalMethodInvocation {

    public String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public boolean getCondition() {
        return false;
    }

    public String showBug(String input) {
        input.toString(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)

        boolean condition = getCondition();
        if (condition) {
            System.out.println("This line is unreachable due to the always false condition.");
        }

        return input;
    }

    public static void main(String[] args) {
        NonsensicalMethodInvocation obj = new NonsensicalMethodInvocation();
        System.out.println(obj.showBug("Hello World")); // Still prints "Hello World"
    }
}