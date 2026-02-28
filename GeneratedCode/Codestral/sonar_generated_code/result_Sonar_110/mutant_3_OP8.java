class NullPointerDereference {
    private String message;
    private String a; // Mutant: added a new variable 'a'

    public void showBug() {
        a = message; // Mutant: assigned the value of'message' to 'a'
        System.out.println(a.length()); // Mutant: changed'message' to 'a'
    }
}