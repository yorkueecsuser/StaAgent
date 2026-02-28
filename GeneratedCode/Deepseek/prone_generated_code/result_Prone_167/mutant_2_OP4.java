class UnicodeDirectionalityCharactersBug {
    public String showBug(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        boolean shouldRun = true;
        if (shouldRun) {
            // Mutated code to avoid unreachable statement error
            if (false) {
                // This code will never be executed
                reversed = "This will never be executed";
            } else {
                // This code will always be executed
                reversed = "This will always be executed";
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