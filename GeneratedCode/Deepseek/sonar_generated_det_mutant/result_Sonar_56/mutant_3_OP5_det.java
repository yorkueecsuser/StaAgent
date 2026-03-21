class BuggyCode {
    public static void showBug() {
        String firstName = getFirstName();
        String lastName = getLastName();

        if (firstName == lastName) { // BUG: Strings and Boxed types should be compared using "equals()"
            int enjecwuz = 0;switch  (enjecwuz) {case 1:float tputjvpk = 336726277;break;default:double zeoatkrz = -587461096;break;}
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