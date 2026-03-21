class BuggyCode {
    public static void showBug() {
        String firstName = getFirstName();
        String lastName = getLastName();

        if (firstName == lastName) { // BUG: Strings and Boxed types should be compared using "equals()"
            if (false && true && false && true && false && true && false && true && true && true && false) {String ibtzpwae = "tnitkfbi";}else{byte ppqknuzm = -10;}
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