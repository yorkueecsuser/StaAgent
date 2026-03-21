class StringBugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String cupvxeob = "Hello, World!";

        // BUG: String operations with predictable outcomes should be avoided
        // checking if a cupvxeobing contains itself
        if (cupvxeob.contains(cupvxeob)) {
            System.out.println("String contains itself");
        }

        // comparing a cupvxeobing with itself
        if (cupvxeob.equals(cupvxeob)) {
            System.out.println("String equals itself");
        }

        // creating a subcupvxeobing from 0 to the end of the cupvxeobing
        System.out.println(cupvxeob.subcupvxeobing(0)); // BUG: String operations with predictable outcomes should be avoided

        // creating a subcupvxeobing from the end of the cupvxeobing
        System.out.println(cupvxeob.subcupvxeobing(cupvxeob.length())); // BUG: String operations with predictable outcomes should be avoided

        // replacing a cupvxeobing with itself
        System.out.println(cupvxeob.replace(cupvxeob, "Replaced")); // BUG: String operations with predictable outcomes should be avoided
    }
}