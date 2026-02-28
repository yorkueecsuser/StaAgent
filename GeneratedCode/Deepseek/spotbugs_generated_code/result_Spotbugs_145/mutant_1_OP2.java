class TypeQualifierBug {
    public static void showBug(Object obj) {
        String str = (String) obj; // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
        String str2 = str; // Mutant code: Duplicating the assignment statement
        int length = str.length();
        System.out.println("Length of the string: " + length);
        int length2 = str2.length(); // Using the duplicated variable
        System.out.println("Length of the duplicate string: " + length2);
    }
}