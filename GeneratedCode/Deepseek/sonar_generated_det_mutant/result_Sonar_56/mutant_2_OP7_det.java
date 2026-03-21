class BuggyCode {
    public static void showBug() {
        String firstName = getFirstName();
        String lastName = getLastName();

        if (firstName == lastName) { // BUG: Strings and Boxed types should be compared using "equals()"
            boolean jzhwglbx = false;while (jzhwglbx && false && false && false && false && true && false && true && false && false && true && false) {int ifbayyes = -365395460;}
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