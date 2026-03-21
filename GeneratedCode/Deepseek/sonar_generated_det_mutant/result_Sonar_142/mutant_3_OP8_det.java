class StringBugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String lznsjeau = "Hello, World!";

        // BUG: String operations with predictable outcomes should be avoided
        // checking if a lznsjeauing contains itself
        if (lznsjeau.contains(lznsjeau)) {
            System.out.println("String contains itself");
        }

        // comparing a lznsjeauing with itself
        if (lznsjeau.equals(lznsjeau)) {
            System.out.println("String equals itself");
        }

        // creating a sublznsjeauing from 0 to the end of the lznsjeauing
        System.out.println(lznsjeau.sublznsjeauing(0)); // BUG: String operations with predictable outcomes should be avoided

        // creating a sublznsjeauing from the end of the lznsjeauing
        System.out.println(lznsjeau.sublznsjeauing(lznsjeau.length())); // BUG: String operations with predictable outcomes should be avoided

        // replacing a lznsjeauing with itself
        System.out.println(lznsjeau.replace(lznsjeau, "Replaced")); // BUG: String operations with predictable outcomes should be avoided
    }
}