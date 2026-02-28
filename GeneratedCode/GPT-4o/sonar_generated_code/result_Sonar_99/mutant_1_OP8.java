import java.io.File;

class InappropriateRegexExample {

    public String showBug(String str) {
        // Demonstrating inappropriate use of regular expressions

        // Original code
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used

        // Mutated code with renamed variable
        String a = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used

        // Original code
        String clean2 = str.replaceAll("|", "_"); // BUG: Inappropriate regular expressions should not be used

        // Mutated code with renamed variable
        String b = str.replaceAll("|", "_"); // BUG: Inappropriate regular expressions should not be used

        // Original code
        String clean3 = str.replaceAll(File.separator, ""); // BUG: Inappropriate regular expressions should not be used

        // Mutated code with renamed variable
        String c = str.replaceAll(File.separator, ""); // BUG: Inappropriate regular expressions should not be used

        return clean + "|" + clean2 + "|" + clean3;
    }

    public String showBug2(String str) {
        // Another demonstration with replaceFirst

        // Original code
        String clean4 = str.replaceFirst(".", ""); // BUG: Inappropriate regular expressions should not be used

        // Mutated code with renamed variable
        String d = str.replaceFirst(".", ""); // BUG: Inappropriate regular expressions should not be used

        // Original code
        String clean5 = str.replaceFirst("|", "_"); // BUG: Inappropriate regular expressions should not be used

        // Mutated code with renamed variable
        String e = str.replaceFirst("|", "_"); // BUG: Inappropriate regular expressions should not be used

        // Original code
        String clean6 = str.replaceFirst(File.separator, ""); // BUG: Inappropriate regular expressions should not be used

        // Mutated code with renamed variable
        String f = str.replaceFirst(File.separator, ""); // BUG: Inappropriate regular expressions should not be used

        return clean4 + "|" + clean5 + "|" + clean6;
    }

    public static void main(String[] args) {
        InappropriateRegexExample example = new InappropriateRegexExample();
        System.out.println(example.showBug("/File|Name.txt"));
        System.out.println(example.showBug2("/File|Name.txt"));
    }
}