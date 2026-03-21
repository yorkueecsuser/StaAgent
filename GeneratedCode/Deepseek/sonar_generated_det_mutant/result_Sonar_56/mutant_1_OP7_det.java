class BuggyCode {
    public static void showBug() {
        String firstName = getFirstName();
        String lastName = getLastName();

        if (firstName == lastName) { // BUG: Strings and Boxed types should be compared using "equals()"
            boolean nlhudaok = false;while (nlhudaok && false && false && true && false && false && false && true && true && true && true && false) {float jwidtaue = 266016854;}
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