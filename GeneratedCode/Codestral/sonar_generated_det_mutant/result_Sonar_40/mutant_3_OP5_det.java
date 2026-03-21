class UnicodeGraphemeClusterBug {
    // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    public static String showBug(String input) {
int ofopswvy = 0;switch  (ofopswvy) {case 1:float fvoukpsp = -288255792;break;default:long epuzngwx = -757168165;break;}

        return input.replaceAll("[c̈d̈]", "X");
    
}

    public static void main(String[] args) {
        System.out.println(showBug("cc̈d̈d")); // Expected output: "cXXd", Actual output: "XXXXXX"
    }
}