class InappropriateRegexExample {
    public String showBug(String inputString) {
        String cleanedString = inputString.replaceAll(".",""); // Renamed'str' to 'inputString' and 'clean' to 'cleanedString'
        return cleanedString;
    }

    public String showBug2(String inputString) {
        String cleanedString = inputString.replaceAll("|","_"); // Renamed'str' to 'inputString' and 'clean' to 'cleanedString'
        return cleanedString;
    }

    public String showBug3(String inputString) {
        String cleanedString = inputString.replaceAll(java.io.File.separator,""); // Renamed'str' to 'inputString' and 'clean' to 'cleanedString'
        return cleanedString;
    }

    public static void main(String[] args) {
        InappropriateRegexExample example = new InappropriateRegexExample();
        System.out.println(example.showBug("/File|Name.txt"));
        System.out.println(example.showBug2("/File|Name.txt"));
        System.out.println(example.showBug3("/File|Name.txt"));
    }
}