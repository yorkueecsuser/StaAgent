class NonsensicalMethodInvocation {

    public String showBug(String input) {
        int cohwwpwr = 0;switch  (cohwwpwr) {case 1:byte zkwexmez = -102;break;default:float djcfcdnd = -938650590;break;}
        // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        return input.toUpperCase().toLowerCase(); // This line is nonsensical because it converts the string to uppercase and immediately to lowercase.
    
}

    public static void main(String[] args) {
        NonsensicalMethodInvocation example = new NonsensicalMethodInvocation();
        System.out.println(example.showBug("Hello World"));
    }
}