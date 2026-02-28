class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            String renamedStr = (String) obj; // Mutant code: Renaming the variable 'obj' to'renamedStr'
            return renamedStr.toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    }
}