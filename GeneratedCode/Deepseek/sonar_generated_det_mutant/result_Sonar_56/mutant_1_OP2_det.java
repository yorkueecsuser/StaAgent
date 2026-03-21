class BuggyCode {
public static void showBug() {
    String firstName = getFirstName();
    String lastName = getLastName();
    lastName = getLastName();
    if(firstName == lastName){ System.out.println("Names are equal"); }
}

    public static String getFirstName() {
        return new String("John");
    }

    public static String getLastName() {
        return new String("John");
    }
}