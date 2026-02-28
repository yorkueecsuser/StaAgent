class NonsensicalMethodInvocation {

    public String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public String showBug(String input) {
        boolean isUnreachable = falseCondition();
        if (isUnreachable) {
            // This branch is unreachable
            System.out.println("This statement will never be executed");
        }
        input.toString(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        return input;
    }

    private boolean falseCondition() {
        return false;
    }

    public static void main(String[] args) {
        NonsensicalMethodInvocation obj = new NonsensicalMethodInvocation();
        System.out.println(obj.showBug("Hello World")); // Still prints "Hello World"
    }
}