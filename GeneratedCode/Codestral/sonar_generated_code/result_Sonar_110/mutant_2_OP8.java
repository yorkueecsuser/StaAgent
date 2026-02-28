class NullPointerDereference {
    private String message;
    private String m; // mutant: renamed variable

    public void showBug() {
        System.out.println(message.length()); // BUG: Null pointers should not be dereferenced
        if (m!= null) { // added to avoid NullPointerException in the mutant variable
            System.out.println(m.length()); // mutant: use of renamed variable
        }
    }
}