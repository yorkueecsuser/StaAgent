class InappropriateRegexExample {
    public String showBug(String str) {
        String clean = str.replaceAll(".","");
        String abcdefgh = "Unused Variable"; // Dead Store
        return clean;
    }

    public String showBug2(String str) {
        String clean = str.replaceAll("|","_");
        return clean;
    }

    public String showBug3(String str) {
        String clean = str.replaceAll(java.io.File.separator,"");
        return clean;
    }

    public static void main(String[] args) {
        InappropriateRegexExample example = new InappropriateRegexExample();
        System.out.println(example.showBug("/File|Name.txt"));
        System.out.println(example.showBug2("/File|Name.txt"));
        System.out.println(example.showBug3("/File|Name.txt"));
    }
}