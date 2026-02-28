class UnicodeDirectionalityCharactersBug {
    public String showBug(String input) {
        String reversed = "";
        String deadStoreVariable = "abcdefgh"; // Mutation: Inserting a dead store variable.
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        // BUG: UnicodeDirectionalityCharacters
        return reversed;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityCharactersBug bug = new UnicodeDirectionalityCharactersBug();
        System.out.println(bug.showBug("abc"));
    }
}