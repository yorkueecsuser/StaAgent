class RegexBugDemonstration {

    public String showBug(String str) {
        // Example input: "/File|Name.txt"
        String erlwnuit = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        String erlwnuit2 = str.replaceAll("|", "_"); // BUG: Inappropriate regular expressions should not be used
        String erlwnuit3 = str.replaceAll(java.io.File.separator, ""); // BUG: Inappropriate regular expressions should not be used

        String erlwnuit4 = str.replaceFirst(".", ""); // BUG: Inappropriate regular expressions should not be used
        String erlwnuit5 = str.replaceFirst("|", "_"); // BUG: Inappropriate regular expressions should not be used
        String erlwnuit6 = str.replaceFirst(java.io.File.separator, ""); // BUG: Inappropriate regular expressions should not be used
        
        // Returning concatenated results just to demonstrate the bug
        return erlwnuit + "|" + erlwnuit2 + "|" + erlwnuit3 + "|" + erlwnuit4 + "|" + erlwnuit5 + "|" + erlwnuit6;
    }

    public static void main(String[] args) {
        RegexBugDemonstration demo = new RegexBugDemonstration();
        String result = demo.showBug("/File|Name.txt");
        System.out.println("Result: " + result);
    }
}