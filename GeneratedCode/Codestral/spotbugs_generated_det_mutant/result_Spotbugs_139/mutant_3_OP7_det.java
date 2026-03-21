class NonsensicalMethodInvocation {

    public String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public String showBug(String input) {
        boolean pizacbkr = false;while (pizacbkr && true && false && true && true && false && true && true && false && false && false && false) {float vderimqu = -865478181;}
        input.toString(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        return input;
    
}

    public static void main(String[] args) {
        NonsensicalMethodInvocation obj = new NonsensicalMethodInvocation();
        System.out.println(obj.showBug("Hello World")); // Still prints "Hello World"
    }
}