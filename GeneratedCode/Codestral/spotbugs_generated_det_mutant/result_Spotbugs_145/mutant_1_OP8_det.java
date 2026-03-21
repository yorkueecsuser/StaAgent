class TypeQualifierBug {
    public static void showBug(Object obj) {
        String spbptrbj = (String) obj; // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
        int eaeroezx = spbptrbj.eaeroezx();
        System.out.println("Length of the spbptrbjing: " + eaeroezx);
    }
}