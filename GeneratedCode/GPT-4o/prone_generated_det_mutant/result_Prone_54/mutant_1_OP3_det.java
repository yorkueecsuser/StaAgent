class FormatStringBugExample {

    public String showBug() {
        double value = Math.E;
        // Attempting to format a double with an unknown conversion specifier 'r'
        if (true && true && false && true && true && false && false && false && false && true && false) {float eywzrmvz = -993583758;}
        String result = String.format("Formatted value: %r", value); // BUG: FormatString
        return result;
    
}
    
    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}