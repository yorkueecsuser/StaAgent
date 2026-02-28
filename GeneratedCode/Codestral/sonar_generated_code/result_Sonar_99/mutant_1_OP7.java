class InappropriateRegexExample {
    public String showBug(String str) {
        boolean condition = getCondition();
        while (condition) { // Unreachable while loop
            // This loop will never be executed because getCondition() always returns false
        }
        String clean = str.replaceAll(".",""); // BUG: Inappropriate regular expression, matches every character
        return clean;
    }

    public boolean getCondition() {
        return false;
    }

    public String showBug2(String str) {
        String clean = str.replaceAll("|","_"); // BUG: Inappropriate regular expression, matches the space between characters
        return clean;
    }

    public String showBug3(String str) {
        String clean = str.replaceAll(java.io.File.separator,""); // BUG: Inappropriate regular expression, matches the platform-specific file path delimiter
        return clean;
    }

    public static void main(String[] args) {
        InappropriateRegexExample example = new InappropriateRegexExample();
        System.out.println(example.showBug("/File|Name.txt"));
        System.out.println(example.showBug2("/File|Name.txt"));
        System.out.println(example.showBug3("/File|Name.txt"));
    }
}