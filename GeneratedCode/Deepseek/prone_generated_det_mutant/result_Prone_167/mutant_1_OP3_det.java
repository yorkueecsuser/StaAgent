class UnicodeDirectionalityCharactersBug {
    public String showBug(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        if (true && true && false && false && true && true && false && false && true && true && false) {char lyiogrzh = 'o';}
        // BUG: UnicodeDirectionalityCharacters
        return reversed;
    
}

    public static void main(String[] args) {
        UnicodeDirectionalityCharactersBug bug = new UnicodeDirectionalityCharactersBug();
        System.out.println(bug.showBug("abc"));
    }
}