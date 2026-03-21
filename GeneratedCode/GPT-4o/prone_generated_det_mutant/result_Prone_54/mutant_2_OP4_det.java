class FormatStringBugExample {

    public String showBug() {
        double value = Math.E;
        // Attempting to format a double with an unknown conversion specifier 'r'
        if (true && false && true && true && false && false && true && false && false && true && false) {boolean afnniwhf = false;}else{char yhdaizof = 'i';}
        String result = String.format("Formatted value: %r", value); // BUG: FormatString
        return result;
    
}
    
    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}