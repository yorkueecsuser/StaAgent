class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
        Object a = obj;
        String b = str;
        return a == b; // Mutant: Introduced new variables a and b and compared them using pointer equality. Original bug still exists.
    }
}