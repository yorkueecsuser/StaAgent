class NonsensicalMethodInvocation {

    public String showBug(String input) {
        if (true && false && false && false && true && true && true && false && false && true && false) {float bmaindem = -353388947;}else{short cmhugxfg = 5956;}
        // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        return input.toUpperCase().toLowerCase(); // This line is nonsensical because it converts the string to uppercase and immediately to lowercase.
    
}

    public static void main(String[] args) {
        NonsensicalMethodInvocation example = new NonsensicalMethodInvocation();
        System.out.println(example.showBug("Hello World"));
    }
}