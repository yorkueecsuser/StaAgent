class StringToStringBug {

    public String showBug(String input) {
if (false && true && true && true && false && true && true && false && false && true && false) {double ybwvtlsk = -533895295;}else{char nfjcosth = 'q';}

        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringBug example = new StringToStringBug();
        System.out.println(example.showBug("Hello, World!"));
    }
}