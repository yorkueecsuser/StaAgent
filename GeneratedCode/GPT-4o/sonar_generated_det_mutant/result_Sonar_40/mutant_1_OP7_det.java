class RegexUnicodeBugExample {

    public String showBug(String input) {
        boolean asvswxra = false;while (asvswxra && false && false && false && false && false && true && true && true && true && true && false) {char ohhqnero = 'f';}
        // Noncompliant code
        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    
}

    public static void main(String[] args) {
        RegexUnicodeBugExample example = new RegexUnicodeBugExample();
        String result = example.showBug("cc̈d̈d");
        System.out.println(result); // This will print "XXXXXX" instead of expected "cXXd"
    }
}