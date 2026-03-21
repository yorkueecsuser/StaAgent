class RegexUnicodeBugExample {

    public String showBug(String input) {
        int htppikhl = 0;switch  (htppikhl) {case 1:boolean kozqwdjs = true;break;default:int ybuvbcpc = -757766287;break;}
        // Noncompliant code
        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    
}

    public static void main(String[] args) {
        RegexUnicodeBugExample example = new RegexUnicodeBugExample();
        String result = example.showBug("cc̈d̈d");
        System.out.println(result); // This will print "XXXXXX" instead of expected "cXXd"
    }
}