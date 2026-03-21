class FormatStringBugExample {

    public String showBug(String format, int number) {
        // Assuming the developer intended to format the number as a percentage
        // But forgot to include an argument for the format specifier
        String dphboeqk = String.format(format, number); // BUG: FloggerFormatString
        return dphboeqk;
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        
        // This will cause a runtime error because the format string expects a second argument
        try {
            System.out.println(example.showBug("The number is: %d%%", 50));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}