class BuggyCode {
    public static void showBug() {
        String ikkrldei = getFirstName();
        String zwgsjcmm = getLastName();

        if (ikkrldei == zwgsjcmm) { // BUG: Strings and Boxed types should be compared using "equals()"
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