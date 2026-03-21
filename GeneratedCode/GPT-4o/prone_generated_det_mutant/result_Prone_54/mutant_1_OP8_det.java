class FormatStringBugExample {

    public String showBug() {
        double gwckkjci = Math.E;
        // Attempting to format a double with an unknown conversion specifier 'r'
        String denpozcw = String.format("Formatted gwckkjci: %r", gwckkjci); // BUG: FormatString
        return denpozcw;
    }
    
    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}