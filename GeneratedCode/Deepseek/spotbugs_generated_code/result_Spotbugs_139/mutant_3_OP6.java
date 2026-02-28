class NonsensicalMethodInvocation {

    public String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public String showBug(String input) {
        input.toString(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        boolean isTrue = false;
        for (int i = 0; isTrue; i++) { // Unreachable for loop
            System.out.println("This is an unreachable loop.");
        }
        return input;
    }

    public static void main(String[] args) {
        NonsensicalMethodInvocation obj = new NonsensicalMethodInvocation();
        System.out.println(obj.showBug("Hello World")); // Still prints "Hello World"
    }
}