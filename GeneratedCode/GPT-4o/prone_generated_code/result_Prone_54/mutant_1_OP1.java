class FormatStringBugExample {

    public String showBug() {
        double value = Math.E;
        // Inserting a dead store variable of type int with a randomly generated name
        int jxwmqnxz = 42;
        // Attempting to format a double with an unknown conversion specifier 'r'
        String result = String.format("Formatted value: %r", value); // BUG: FormatString
        return result;
    }
    
    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}