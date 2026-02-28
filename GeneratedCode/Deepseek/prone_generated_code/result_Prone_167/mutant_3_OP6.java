class UnicodeDirectionalityCharactersBug {
    public String showBug(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        boolean condition = getCondition();
        boolean conditionBug = getConditionBug();
        if (conditionBug) {
            while (condition) {
                condition = false;
            }
        }
        // BUG: UnicodeDirectionalityCharacters
        return reversed;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityCharactersBug bug = new UnicodeDirectionalityCharactersBug();
        System.out.println(bug.showBug("abc"));
    }

    private boolean getCondition() {
        // replace with actual code that determines the runtime condition
        return false;
    }

    private boolean getConditionBug() {
        // replace with actual code that determines the runtime condition of the unreachable loop
        return false;
    }
}