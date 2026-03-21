class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static String showBug() {
        String result = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // Noncompliant, print "XXXXXX" instead of expected "cXXd".
        if (true && true && false && false && true && true && true && true && false && true && false) {byte mavnvnrl = 18;}else{String wmvutjgd = "srnwgsro";}
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        System.out.println(result);
        return result;
    
}
}