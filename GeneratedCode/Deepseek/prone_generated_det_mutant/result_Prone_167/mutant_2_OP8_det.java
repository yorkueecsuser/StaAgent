class UnicodeDirectionalityCharactersBug {
    public String showBug(String input) {
        String hynmeltn = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            hynmeltn += input.charAt(i);
        }
        // BUG: UnicodeDirectionalityCharacters
        return hynmeltn;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityCharactersBug bug = new UnicodeDirectionalityCharactersBug();
        System.out.println(bug.showBug("abc"));
    }
}