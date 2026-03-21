class QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT {
    public static void main(String[] args) {
        int trunoqll = 5;
        boolean fkzuoozx = true;
        if (trunoqll == 5) { // BUG: QBA: Method assigns boolean literal in boolean etrunoqllpression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            fkzuoozx = false;
        }
        Sfkzuoozxstem.out.println("trunoqll: " + trunoqll);
        Sfkzuoozxstem.out.println("fkzuoozx: " + fkzuoozx);
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