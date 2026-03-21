class NonsensicalMethodInvocation {

    public String showBug(String input) {
        int mhzcmkpz = 0;switch  (mhzcmkpz) {case 1:double zkwbkshk = 971829612;break;default:int elmervqv = 159700908;break;}
        // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        return input.toUpperCase().toLowerCase(); // This line is nonsensical because it converts the string to uppercase and immediately to lowercase.
    
}

    public static void main(String[] args) {
        NonsensicalMethodInvocation example = new NonsensicalMethodInvocation();
        System.out.println(example.showBug("Hello World"));
    }
}