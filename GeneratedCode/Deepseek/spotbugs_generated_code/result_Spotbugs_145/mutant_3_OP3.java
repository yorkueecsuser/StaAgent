class TypeQualifierBug {
    public static boolean getFalseCondition() {
        return false;
    }

    public static void showBug(Object obj) {
        String str = (String) obj;
        int length = str.length();

        // Mutated code: Unreachable if statement
        if (getFalseCondition()) {
            System.out.println("This line is unreachable");
        }

        System.out.println("Length of the string: " + length);
    }
}