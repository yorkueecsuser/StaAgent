class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            return ((String) obj).toUpperCase();
        } else if (getCondition()) {  // added unreachable if statement
            System.out.println("This line will never execute.");
        }
        throw new IllegalArgumentException("Object is not a String");
    }

    private boolean getCondition() {
        return false;  // always returns false, making the if statement unreachable
    }
}