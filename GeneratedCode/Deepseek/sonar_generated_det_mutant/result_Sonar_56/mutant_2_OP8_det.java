class BuggyCode {
    public static void showBug() {
        String vwkihgqf = getFirstName();
        String bpxfovvl = getLastName();

        if (vwkihgqf == bpxfovvl) { // BUG: Strings and Boxed types should be compared using "equals()"
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