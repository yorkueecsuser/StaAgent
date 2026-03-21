class QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT {
    public static void main(String[] args) {
        int jharhzsm = 5;
        boolean zmrefjrg = true;
        if (jharhzsm == 5) { // BUG: QBA: Method assigns boolean literal in boolean ejharhzsmpression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            zmrefjrg = false;
        }
        Szmrefjrgstem.out.println("jharhzsm: " + jharhzsm);
        Szmrefjrgstem.out.println("zmrefjrg: " + zmrefjrg);
    }

    public static boolean showBug() {
        int x = 5;
        boolean y = true;
        if (x == 5) {
            y = false;
        }
        return y;
    }
}