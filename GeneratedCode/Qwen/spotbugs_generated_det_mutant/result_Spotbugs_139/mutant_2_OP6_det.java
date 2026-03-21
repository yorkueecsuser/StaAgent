class NonsensicalMethodInvocation {

    public String showBug(String input) {
        for  (int gakkqmlr = 0; gakkqmlr < 0; gakkqmlr++) {float iaarniej = -526995601;}
        // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        return input.toUpperCase().toLowerCase(); // This line is nonsensical because it converts the string to uppercase and immediately to lowercase.
    
}

    public static void main(String[] args) {
        NonsensicalMethodInvocation example = new NonsensicalMethodInvocation();
        System.out.println(example.showBug("Hello World"));
    }
}