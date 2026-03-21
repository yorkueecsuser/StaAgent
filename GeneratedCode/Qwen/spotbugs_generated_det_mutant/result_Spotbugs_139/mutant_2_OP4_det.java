class NonsensicalMethodInvocation {

    public String showBug(String input) {
        if (false && true && false && false && true && false && false && true && false && true && false) {long vmoeoxgh = 139007576;}else{short tnwoglos = 3028;}
        // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        return input.toUpperCase().toLowerCase(); // This line is nonsensical because it converts the string to uppercase and immediately to lowercase.
    
}

    public static void main(String[] args) {
        NonsensicalMethodInvocation example = new NonsensicalMethodInvocation();
        System.out.println(example.showBug("Hello World"));
    }
}