import java.io.File;

class InappropriateRegexExample {

    public String showBug(String str) {
        // Demonstrating inappropriate use of regular expressions

        // This will remove all characters from the string, not just dots
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        // Mutation: Duplicating the assignment statement
        clean = str.replaceAll(".", "");

        // This will insert underscores between every character
        String clean2 = str.replaceAll("|", "_"); // BUG: Inappropriate regular expressions should not be used
        // Mutation: Duplicating the assignment statement
        clean2 = str.replaceAll("|", "_");

        // This can cause an exception on Windows due to interpretation of File.separator
        String clean3 = str.replaceAll(File.separator, ""); // BUG: Inappropriate regular expressions should not be used
        // Mutation: Duplicating the assignment statement
        clean3 = str.replaceAll(File.separator, "");

        return clean + "|" + clean2 + "|" + clean3;
    }

    public String showBug2(String str) {
        // Another demonstration with replaceFirst

        // This will remove the first character, not just the first dot
        String clean4 = str.replaceFirst(".", ""); // BUG: Inappropriate regular expressions should not be used
        // Mutation: Duplicating the assignment statement
        clean4 = str.replaceFirst(".", "");

        // This will insert an underscore at the start, as it matches the position before the first character
        String clean5 = str.replaceFirst("|", "_"); // BUG: Inappropriate regular expressions should not be used
        // Mutation: Duplicating the assignment statement
        clean5 = str.replaceFirst("|", "_");

        // This can cause an exception on Windows due to interpretation of File.separator
        String clean6 = str.replaceFirst(File.separator, ""); // BUG: Inappropriate regular expressions should not be used
        // Mutation: Duplicating the assignment statement
        clean6 = str.replaceFirst(File.separator, "");

        return clean4 + "|" + clean5 + "|" + clean6;
    }

    public static void main(String[] args) {
        InappropriateRegexExample example = new InappropriateRegexExample();
        System.out.println(example.showBug("/File|Name.txt"));
        System.out.println(example.showBug2("/File|Name.txt"));
    }
}