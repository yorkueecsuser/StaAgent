class NonsensicalMethodInvocation {

    public String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public String showBug(String input) {
        if (true && false && false && true && true && false && true && true && true && true && false) {double gowmlwjk = -690149430;}
        input.toString(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        return input;
    
}

    public static void main(String[] args) {
        NonsensicalMethodInvocation obj = new NonsensicalMethodInvocation();
        System.out.println(obj.showBug("Hello World")); // Still prints "Hello World"
    }
}