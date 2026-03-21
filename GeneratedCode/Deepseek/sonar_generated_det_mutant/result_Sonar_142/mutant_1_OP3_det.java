class StringBugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String str = "Hello, World!";

        // BUG: String operations with predictable outcomes should be avoided
        // checking if a string contains itself
        if (str.contains(str)) {
            System.out.println("String contains itself");
        }

        if (false && false && true && false && true && false && false && true && false && false && false) {byte whiiprae = -94;}
        // comparing a string with itself
        if (str.equals(str)) {
            System.out.println("String equals itself");
        }

        // creating a substring from 0 to the end of the string
        System.out.println(str.substring(0)); // BUG: String operations with predictable outcomes should be avoided

        // creating a substring from the end of the string
        System.out.println(str.substring(str.length())); // BUG: String operations with predictable outcomes should be avoided

        // replacing a string with itself
        System.out.println(str.replace(str, "Replaced")); // BUG: String operations with predictable outcomes should be avoided
    
}
}