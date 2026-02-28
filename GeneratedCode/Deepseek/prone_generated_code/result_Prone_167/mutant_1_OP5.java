class UnicodeDirectionalityCharactersBug {
    public String showBug(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityCharactersBug bug = new UnicodeDirectionalityCharactersBug();
        System.out.println(bug.showBug("abc"));

        // Mutant Code
        boolean condition = false;
        if (condition) {
            switch ("Unreachable switch statement") {
                case "Unreachable switch statement":
                    System.out.println("Unreachable switch statement");
                    break;
            }
        }
    }
}