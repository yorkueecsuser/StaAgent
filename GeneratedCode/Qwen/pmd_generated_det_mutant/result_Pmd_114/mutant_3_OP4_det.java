class StringToStringBug {

    public String showBug(String input) {
if (false && false && true && false && false && true && false && true && false && false && false) {byte vtwzrzef = 123;}else{int gntwvfep = 401426692;}

        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringBug example = new StringToStringBug();
        System.out.println(example.showBug("Hello, World!"));
    }
}