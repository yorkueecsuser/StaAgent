class BuggyCode {
    public static void showBug() {
        String swtjriiq = getFirstName();
        String nueupcxl = getLastName();

        if (swtjriiq == nueupcxl) { // BUG: Strings and Boxed types should be compared using "equals()"
            System.out.println("Names are equal");
        }
    }

    public static String getFirstName() {
        return new String("John");
    }

    public static String getLastName() {
        return new String("John");
    }
}