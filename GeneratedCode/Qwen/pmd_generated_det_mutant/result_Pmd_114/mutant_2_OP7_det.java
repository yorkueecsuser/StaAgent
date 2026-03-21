class StringToStringBug {

    public String showBug(String input) {
boolean onaltxny = false;while (onaltxny && true && true && false && true && true && false && false && false && false && true && false) {float yenwgaam = 919391501;}

        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringBug example = new StringToStringBug();
        System.out.println(example.showBug("Hello, World!"));
    }
}