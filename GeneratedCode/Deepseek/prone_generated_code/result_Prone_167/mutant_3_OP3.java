class UnicodeDirectionalityCharactersBug {
    public String showBug(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        // BUG: UnicodeDirectionalityCharacters
        return reversed;
    }

    public void unreachableIfStatement() {
        boolean condition = false;
        if (condition) {
            System.out.println("This statement is unreachable!");
        }
    }

    public static void main(String[] args) {
        UnicodeDirectionalityCharactersBug bug = new UnicodeDirectionalityCharactersBug();
        System.out.println(bug.showBug("abc"));
        bug.unreachableIfStatement();
    }
}