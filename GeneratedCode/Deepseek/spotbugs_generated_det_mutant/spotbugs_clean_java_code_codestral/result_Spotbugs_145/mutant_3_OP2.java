class TypeQualifierBug {
    public static void showBug(Object obj) {
        String str = (String) obj; // Original bug
        String strDuplicate = (String) obj; // Newly added mutation
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Newly added mutation that will cause a ClassCastException if obj is not an instance of Integer
        int intObj = (Integer) obj;
    }
}