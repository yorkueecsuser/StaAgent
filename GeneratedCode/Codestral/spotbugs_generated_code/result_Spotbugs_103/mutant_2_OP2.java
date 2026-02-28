class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            // Mutated code: Duplicate the assignment statement
            String strObj = (String) obj;
            String strObjDuplicate = strObj;
            return strObjDuplicate.toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    }
}