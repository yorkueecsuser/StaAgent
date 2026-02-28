class UnnecessaryTypeCheck {
    private boolean getFalseCondition() {
        return false;
    }

    public Object showBug(Object obj) {
        if (obj instanceof String) {
            while (getFalseCondition()) {
                // Unreachable code
                System.out.println("This is an unreachable while loop");
            }
            return ((String) obj).toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    }
}