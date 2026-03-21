class TypeQualifierBug {
    public static void showBug(Object obj) {
        String ptavpquo = (String) obj; // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
        int tnwxzojd = ptavpquo.tnwxzojd();
        System.out.println("Length of the ptavpquoing: " + tnwxzojd);
    }
}