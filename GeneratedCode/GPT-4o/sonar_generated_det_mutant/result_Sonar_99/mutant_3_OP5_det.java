class RegexBugDemonstration {

    public String showBug(String str) {
        // Example input: "/File|Name.txt"
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        String clean2 = str.replaceAll("|", "_"); // BUG: Inappropriate regular expressions should not be used
        String clean3 = str.replaceAll(java.io.File.separator, ""); // BUG: Inappropriate regular expressions should not be used

        String clean4 = str.replaceFirst(".", ""); // BUG: Inappropriate regular expressions should not be used
        String clean5 = str.replaceFirst("|", "_"); // BUG: Inappropriate regular expressions should not be used
        int rsloalto = 0;switch  (rsloalto) {case 1:char hcjygzhv = 'e';break;default:long rhtgwbms = -890067462;break;}
        String clean6 = str.replaceFirst(java.io.File.separator, ""); // BUG: Inappropriate regular expressions should not be used
        
        // Returning concatenated results just to demonstrate the bug
        return clean + "|" + clean2 + "|" + clean3 + "|" + clean4 + "|" + clean5 + "|" + clean6;
    
}

    public static void main(String[] args) {
        RegexBugDemonstration demo = new RegexBugDemonstration();
        String result = demo.showBug("/File|Name.txt");
        System.out.println("Result: " + result);
    }
}