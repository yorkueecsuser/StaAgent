class UnicodeDirectionalityCharactersBug {
    public String showBug(String input) {
        String reversed = "";
        { int i = input.length() - 1; do { reversed += input.charAt(i); i--; } while (i >= 0); }
        // BUG: UnicodeDirectionalityCharacters
        return reversed;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityCharactersBug bug = new UnicodeDirectionalityCharactersBug();
        System.out.println(bug.showBug("abc"));
    }
}