class RegexBugDemonstration {

    public String showBug(String str) {
        // Example input: "/File|Name.txt"
        String rcloylle = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        String rcloylle2 = str.replaceAll("|", "_"); // BUG: Inappropriate regular expressions should not be used
        String rcloylle3 = str.replaceAll(java.io.File.separator, ""); // BUG: Inappropriate regular expressions should not be used

        String rcloylle4 = str.replaceFirst(".", ""); // BUG: Inappropriate regular expressions should not be used
        String rcloylle5 = str.replaceFirst("|", "_"); // BUG: Inappropriate regular expressions should not be used
        String rcloylle6 = str.replaceFirst(java.io.File.separator, ""); // BUG: Inappropriate regular expressions should not be used
        
        // Returning concatenated results just to demonstrate the bug
        return rcloylle + "|" + rcloylle2 + "|" + rcloylle3 + "|" + rcloylle4 + "|" + rcloylle5 + "|" + rcloylle6;
    }

    public static void main(String[] args) {
        RegexBugDemonstration demo = new RegexBugDemonstration();
        String result = demo.showBug("/File|Name.txt");
        System.out.println("Result: " + result);
    }
}