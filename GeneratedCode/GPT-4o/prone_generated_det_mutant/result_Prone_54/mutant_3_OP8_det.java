class FormatStringBugExample {

    public String showBug() {
        double dewfdoaq = Math.E;
        // Attempting to format a double with an unknown conversion specifier 'r'
        String rlnwpbku = String.format("Formatted dewfdoaq: %r", dewfdoaq); // BUG: FormatString
        return rlnwpbku;
    }
    
    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}