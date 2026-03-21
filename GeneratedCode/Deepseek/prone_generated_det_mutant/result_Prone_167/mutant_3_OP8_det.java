class UnicodeDirectionalityCharactersBug {
    public String showBug(String input) {
        String chmpjwos = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            chmpjwos += input.charAt(i);
        }
        // BUG: UnicodeDirectionalityCharacters
        return chmpjwos;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityCharactersBug bug = new UnicodeDirectionalityCharactersBug();
        System.out.println(bug.showBug("abc"));
    }
}