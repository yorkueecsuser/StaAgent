class UnaryBug {
    public int showBug(int i) {
        int j = - - -i;  // BUG: Unary prefix operators should not be repeated
        return j;
    }

    public boolean showBugBoolean(boolean b) {
        boolean c =!!!b;  // BUG: Unary prefix operators should not be repeated
        return c;
    }
}