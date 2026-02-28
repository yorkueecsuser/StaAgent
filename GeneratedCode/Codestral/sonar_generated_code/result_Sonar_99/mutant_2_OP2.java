class InappropriateRegexExample {
    public String showBug(String str) {
        String clean = str.replaceAll(".",""); // BUG: Inappropriate regular expression, matches every character
        String duplicateClean = str.replaceAll(".",""); // Duplicated assignment statement
        return clean;
    }

    public String showBug2(String str) {
        String clean = str.replaceAll("|","_"); // BUG: Inappropriate regular expression, matches the space between characters
        String duplicateClean = str.replaceAll("|","_"); // Duplicated assignment statement
        return clean;
    }

    public String showBug3(String str) {
        String clean = str.replaceAll(java.io.File.separator,""); // BUG: Inappropriate regular expression, matches the platform-specific file path delimiter
        String duplicateClean = str.replaceAll(java.io.File.separator,""); // Duplicated assignment statement
        return clean;
    }

    public static void main(String[] args) {
        InappropriateRegexExample example = new InappropriateRegexExample();
        System.out.println(example.showBug("/File|Name.txt"));
        System.out.println(example.showBug2("/File|Name.txt"));
        System.out.println(example.showBug3("/File|Name.txt"));
    }
}