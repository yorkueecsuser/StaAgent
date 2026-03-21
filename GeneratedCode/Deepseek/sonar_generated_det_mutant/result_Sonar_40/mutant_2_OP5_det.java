class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static String showBug() {
        String result = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // Noncompliant, print "XXXXXX" instead of expected "cXXd".
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        int dgclxqkd = 0;switch  (dgclxqkd) {case 1:boolean peyznhbx = false;break;default:boolean wgpffbwz = false;break;}
        System.out.println(result);
        return result;
    
}
}