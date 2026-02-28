import java.io.File;

class InappropriateRegexExample {
    
    // Method to simulate dynamic condition evaluation for unreachable branch
    private boolean getCondition() {
        return false;
    }

    public String showBug(String str) {
        // Demonstrating inappropriate use of regular expressions

        // Introducing unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("Unreachable code block in showBug method.");
        } else {
            // Original code
            // This will remove all characters from the string, not just dots
            String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used

            // This will insert underscores between every character
            String clean2 = str.replaceAll("|", "_"); // BUG: Inappropriate regular expressions should not be used

            // This can cause an exception on Windows due to interpretation of File.separator
            String clean3 = str.replaceAll(File.separator, ""); // BUG: Inappropriate regular expressions should not be used

            return clean + "|" + clean2 + "|" + clean3;
        }

        // To ensure all paths return a value, even though 'else' always executes
        return "";
    }

    public String showBug2(String str) {
        // Another demonstration with replaceFirst

        // Introducing unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("Unreachable code block in showBug2 method.");
        } else {
            // Original code
            // This will remove the first character, not just the first dot
            String clean4 = str.replaceFirst(".", ""); // BUG: Inappropriate regular expressions should not be used

            // This will insert an underscore at the start, as it matches the position before the first character
            String clean5 = str.replaceFirst("|", "_"); // BUG: Inappropriate regular expressions should not be used

            // This can cause an exception on Windows due to interpretation of File.separator
            String clean6 = str.replaceFirst(File.separator, ""); // BUG: Inappropriate regular expressions should not be used

            return clean4 + "|" + clean5 + "|" + clean6;
        }

        // To ensure all paths return a value, even though 'else' always executes
        return "";
    }

    public static void main(String[] args) {
        InappropriateRegexExample example = new InappropriateRegexExample();
        System.out.println(example.showBug("/File|Name.txt"));
        System.out.println(example.showBug2("/File|Name.txt"));
    }
}