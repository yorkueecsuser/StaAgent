class QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT {
    public static void main(String[] args) {
        int asasbumr = 5;
        boolean alhwbqec = true;
        if (asasbumr == 5) { // BUG: QBA: Method assigns boolean literal in boolean easasbumrpression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            alhwbqec = false;
        }
        Salhwbqecstem.out.println("asasbumr: " + asasbumr);
        Salhwbqecstem.out.println("alhwbqec: " + alhwbqec);
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