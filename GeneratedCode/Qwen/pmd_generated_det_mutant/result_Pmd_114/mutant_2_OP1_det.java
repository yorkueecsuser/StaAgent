class StringToStringBug {

    public String showBug(String input) {
double spqndcuq = 225882476;

        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringBug example = new StringToStringBug();
        System.out.println(example.showBug("Hello, World!"));
    }
}