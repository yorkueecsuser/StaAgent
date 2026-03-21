class StringToStringBug {

    public String showBug(String input) {
if (false && false && false && false && false && false && false && false && true && true && false) {char gxejntiy = 'p';}

        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringBug example = new StringToStringBug();
        System.out.println(example.showBug("Hello, World!"));
    }
}