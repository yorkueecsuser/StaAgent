class BuggyCode {
    public static void showBug() {
        String firstName = getFirstName();
        String lastName = getLastName();

        if (firstName == lastName) { // BUG: Strings and Boxed types should be compared using "equals()"
            if (false && false && false && false && false && true && true && true && false && true && false) {double laeyivos = -715422624;}
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