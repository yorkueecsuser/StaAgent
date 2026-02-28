import java.io.File;

class InappropriateRegexExample {

    public String showBug(String str) {
        // Demonstrating inappropriate use of regular expressions

        // This will remove all characters from the string, not just dots
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used

        // This will insert underscores between every character
        String clean2 = str.replaceAll("|", "_"); // BUG: Inappropriate regular expressions should not be used

        // This can cause an exception on Windows due to interpretation of File.separator
        String clean3 = str.replaceAll(File.separator, ""); // BUG: Inappropriate regular expressions should not be used

        // Unreachable switch statement mutation
        int unreachableSwitch = getUnreachableSwitchValue();
        switch (unreachableSwitch) {
            case 9999:
                System.out.println("This will never be printed.");
                break;
            default:
                // Default case, nothing to execute
                break;
        }

        return clean + "|" + clean2 + "|" + clean3;
    }

    public String showBug2(String str) {
        // Another demonstration with replaceFirst

        // This will remove the first character, not just the first dot
        String clean4 = str.replaceFirst(".", ""); // BUG: Inappropriate regular expressions should not be used

        // This will insert an underscore at the start, as it matches the position before the first character
        String clean5 = str.replaceFirst("|", "_"); // BUG: Inappropriate regular expressions should not be used

        // This can cause an exception on Windows due to interpretation of File.separator
        String clean6 = str.replaceFirst(File.separator, ""); // BUG: Inappropriate regular expressions should not be used

        // Unreachable switch statement mutation
        int unreachableSwitch2 = getUnreachableSwitchValue();
        switch (unreachableSwitch2) {
            case 8888:
                System.out.println("This will also never be printed.");
                break;
            default:
                // Default case, nothing to execute
                break;
        }

        return clean4 + "|" + clean5 + "|" + clean6;
    }

    private int getUnreachableSwitchValue() {
        // This method returns a value that never matches the unreachable case
        return 0;
    }

    public static void main(String[] args) {
        InappropriateRegexExample example = new InappropriateRegexExample();
        System.out.println(example.showBug("/File|Name.txt"));
        System.out.println(example.showBug2("/File|Name.txt"));
    }
}