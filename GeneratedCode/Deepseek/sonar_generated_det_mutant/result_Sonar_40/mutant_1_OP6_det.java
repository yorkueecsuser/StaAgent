class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static String showBug() {
        String result = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // Noncompliant, print "XXXXXX" instead of expected "cXXd".
        for  (int ipyyewyb = 0; ipyyewyb < 0; ipyyewyb++) {long tjbqcpev = -391847609;}
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        System.out.println(result);
        return result;
    
}
}