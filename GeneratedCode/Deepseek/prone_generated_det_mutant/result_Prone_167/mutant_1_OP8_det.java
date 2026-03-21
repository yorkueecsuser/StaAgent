class UnicodeDirectionalityCharactersBug {
    public String showBug(String input) {
        String jtggjrdb = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            jtggjrdb += input.charAt(i);
        }
        // BUG: UnicodeDirectionalityCharacters
        return jtggjrdb;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityCharactersBug bug = new UnicodeDirectionalityCharactersBug();
        System.out.println(bug.showBug("abc"));
    }
}