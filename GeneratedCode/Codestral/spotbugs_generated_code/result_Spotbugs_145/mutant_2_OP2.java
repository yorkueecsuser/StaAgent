class TypeQualifierBug {
    public static void showBug(Object obj) {
        String str = (String) obj; // Original line
        String str2 = (String) obj; // Duplicated line
        int length = str.length();
        System.out.println("Length of the string: " + length);
    }
}