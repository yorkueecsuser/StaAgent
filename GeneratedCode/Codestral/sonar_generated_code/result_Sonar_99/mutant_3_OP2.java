class InappropriateRegexExample {
    public String showBug(String str) {
        String clean = str.replaceAll(".","");
        String cleanedDuplicate = clean;  // Mutant: Duplicate the assignment statement
        return clean;
    }

    public String showBug2(String str) {
        String clean = str.replaceAll("|","_");
        String cleanDuplicate = clean;  // Mutant: Duplicate the assignment statement
        return clean;
    }

    public String showBug3(String str) {
        String clean = str.replaceAll(java.io.File.separator,"");
        String cleanDuplicate = clean;  // Mutant: Duplicate the assignment statement
        return clean;
    }

    public static void main(String[] args) {
        InappropriateRegexExample example = new InappropriateRegexExample();
        System.out.println(example.showBug("/File|Name.txt"));
        System.out.println(example.showBug2("/File|Name.txt"));
        System.out.println(example.showBug3("/File|Name.txt"));
    }
}