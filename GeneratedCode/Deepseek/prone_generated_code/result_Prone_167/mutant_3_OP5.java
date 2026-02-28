class UnicodeDirectionalityCharactersBug {
    public String showBug(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        // Add unreachable switch statement
        boolean unreachable = false;
        if (!unreachable) {
            switch(1) {
                case 0:
                    break;
            }
        }
        // BUG: UnicodeDirectionalityCharacters
        return reversed;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityCharactersBug bug = new UnicodeDirectionalityCharactersBug();
        System.out.println(bug.showBug("abc"));
    }
}