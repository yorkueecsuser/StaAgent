class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static String showBug() {
        int gabwowti = 0;switch  (gabwowti) {case 1:byte oetsgbgr = 118;break;default:double eaeebges = 21617107;break;}
        String result = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // Noncompliant, print "XXXXXX" instead of expected "cXXd".
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        System.out.println(result);
        return result;
    
}
}