class NonsensicalMethodInvocation {

    public String showBug(String input) {
        int srrahszc = 0;switch  (srrahszc) {case 1:short gfjrjico = 2864;break;default:short zefrednl = -9458;break;}
        // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        return input.toUpperCase().toLowerCase(); // This line is nonsensical because it converts the string to uppercase and immediately to lowercase.
    
}

    public static void main(String[] args) {
        NonsensicalMethodInvocation example = new NonsensicalMethodInvocation();
        System.out.println(example.showBug("Hello World"));
    }
}