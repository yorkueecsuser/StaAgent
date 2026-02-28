class UnicodeDirectionalityCharactersBug {
    public String showBug(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        // Mutation: Unreachable if-else statement
        boolean condition = false;
        if (condition) {
            System.out.println("This is always false, so this branch is unreachable.");
        } else {
            System.out.println("This is the unreachable branch.");
        }
        return reversed;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityCharactersBug bug = new UnicodeDirectionalityCharactersBug();
        System.out.println(bug.showBug("abc"));
    }
}