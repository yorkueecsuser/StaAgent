class RegexUnicodeBugExample {

    public String showBug(String input) {
        for  (int qjweglhp = 0; qjweglhp < 0; qjweglhp++) {short xqfnaswi = -143;}
        // Noncompliant code
        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    
}

    public static void main(String[] args) {
        RegexUnicodeBugExample example = new RegexUnicodeBugExample();
        String result = example.showBug("cc̈d̈d");
        System.out.println(result); // This will print "XXXXXX" instead of expected "cXXd"
    }
}