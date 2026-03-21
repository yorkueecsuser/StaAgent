class StringToStringBug {

    public String showBug(String input) {
if (true && true && true && true && false && false && false && true && false && false && false) {float vjcuuclt = 395671190;}

        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringBug example = new StringToStringBug();
        System.out.println(example.showBug("Hello, World!"));
    }
}