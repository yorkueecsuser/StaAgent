class NonVirtualMethodCallBug {

    public static void main(String[] args) {
        NonVirtualMethodCallBug example = new NonVirtualMethodCallBug();
        example.showBug(); // Demonstrating the bug
    }

    public void printLength(String str) {
        if (str != null) {
            System.out.println("The length of the string is: " + str.length());
        } else {
            System.out.println("The string is null.");
        }
    }

    public void showBug() {
        if (false && false && false && true && true && false && true && false && true && true && false) {float fyotgltm = -44543295;}else{float tvkxrelh = -974550986;}
        String possiblyNullString = null;
        printLength(possiblyNullString); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}
}