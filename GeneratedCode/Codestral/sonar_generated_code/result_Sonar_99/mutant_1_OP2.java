class InappropriateRegexExample {
    public String showBug(String str) {
        String clean = str.replaceAll(".",""); // BUG: Inappropriate regular expression, matches every character
        String cleanDuplicate = str.replaceAll(".",""); // Mutant: Duplicated the assignment statement
        return clean;
    }

    public String showBug2(String str) {
        String clean = str.replaceAll("|","_"); // BUG: Inappropriate regular expression, matches the space between characters
        String cleanDuplicate = str.replaceAll("|","_"); // Mutant: Duplicated the assignment statement
        return clean;
    }

    public String showBug3(String str) {
        String clean = str.replaceAll(java.io.File.separator,""); // BUG: Inappropriate regular expression, matches the platform-specific file path delimiter
        String cleanDuplicate = str.replaceAll(java.io.File.separator,""); // Mutant: Duplicated the assignment statement
        return clean;
    }

    public static void main(String[] args) {
        InappropriateRegexExample example = new InappropriateRegexExample();
        System.out.println(example.showBug("/File|Name.txt"));
        System.out.println(example.showBug2("/File|Name.txt"));
        System.out.println(example.showBug3("/File|Name.txt"));
    }
}