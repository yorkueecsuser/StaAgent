class TypeQualifierBug {
    public static void showBug(Object obj) {
        String str = (String) obj; // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
        int length = 0;

        // Original for loop
        // for (int i = 0; i < str.length(); i++) {
        //     length++;
        // }

        // Equivalent do-while loop replacement
        int i = 0;
        do {
            length++;
            i++;
        } while (i < str.length());

        System.out.println("Length of the string: " + length);
    }
}