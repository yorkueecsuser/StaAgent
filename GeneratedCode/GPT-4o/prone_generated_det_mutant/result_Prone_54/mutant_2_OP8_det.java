class FormatStringBugExample {

    public String showBug() {
        double stkdhiqa = Math.E;
        // Attempting to format a double with an unknown conversion specifier 'r'
        String afxlmbbm = String.format("Formatted stkdhiqa: %r", stkdhiqa); // BUG: FormatString
        return afxlmbbm;
    }
    
    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}