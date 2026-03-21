class RegexUnicodeBugExample {

    public String showBug(String input) {
        int ekpiltvz = 0;switch  (ekpiltvz) {case 1:double zcjxzils = -745966511;break;default:int kptzgzcy = 229522174;break;}
        // Noncompliant code
        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    
}

    public static void main(String[] args) {
        RegexUnicodeBugExample example = new RegexUnicodeBugExample();
        String result = example.showBug("cc̈d̈d");
        System.out.println(result); // This will print "XXXXXX" instead of expected "cXXd"
    }
}