class TypeQualifierBug {
    public static boolean getFalseCondition() {
        return false;
    }

    public static void showBug(Object obj) {
        if (getFalseCondition()) {
            // Unreachable code
            System.out.println("This code is unreachable");
        } else {
            // Original code
            String str = (String) obj;
            int length = str.length();
            System.out.println("Length of the string: " + length);
        }
    }
}