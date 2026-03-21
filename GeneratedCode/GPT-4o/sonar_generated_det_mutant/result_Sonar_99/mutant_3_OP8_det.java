class RegexBugDemonstration {

    public String showBug(String str) {
        // Example input: "/File|Name.txt"
        String uqaqlrgt = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        String uqaqlrgt2 = str.replaceAll("|", "_"); // BUG: Inappropriate regular expressions should not be used
        String uqaqlrgt3 = str.replaceAll(java.io.File.separator, ""); // BUG: Inappropriate regular expressions should not be used

        String uqaqlrgt4 = str.replaceFirst(".", ""); // BUG: Inappropriate regular expressions should not be used
        String uqaqlrgt5 = str.replaceFirst("|", "_"); // BUG: Inappropriate regular expressions should not be used
        String uqaqlrgt6 = str.replaceFirst(java.io.File.separator, ""); // BUG: Inappropriate regular expressions should not be used
        
        // Returning concatenated results just to demonstrate the bug
        return uqaqlrgt + "|" + uqaqlrgt2 + "|" + uqaqlrgt3 + "|" + uqaqlrgt4 + "|" + uqaqlrgt5 + "|" + uqaqlrgt6;
    }

    public static void main(String[] args) {
        RegexBugDemonstration demo = new RegexBugDemonstration();
        String result = demo.showBug("/File|Name.txt");
        System.out.println("Result: " + result);
    }
}