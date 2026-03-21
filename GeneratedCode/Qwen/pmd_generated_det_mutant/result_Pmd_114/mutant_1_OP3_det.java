class StringToStringBug {

    public String showBug(String input) {
if (false && true && true && false && false && false && true && false && false && true && false) {long nvuirbwe = 187132848;}

        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringBug example = new StringToStringBug();
        System.out.println(example.showBug("Hello, World!"));
    }
}