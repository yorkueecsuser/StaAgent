class UnicodeDirectionalityCharactersBug {
    public String showBug(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        // BUG: UnicodeDirectionalityCharacters
        return reversed;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityCharactersBug bug = new UnicodeDirectionalityCharactersBug();
        System.out.println(bug.showBug("abc"));
    }
}

class UnreachableSwitchStatementMutant {
    public String showMutant(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        // MUTANT: Unreachable Switch Statement
        boolean condition = getCondition();
        switch ("This switch statement is unreachable") {
            case "This switch statement is unreachable":
                break;
            default:
                break;
        }
        return reversed;
    }

    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityCharactersBug bug = new UnicodeDirectionalityCharactersBug();
        UnreachableSwitchStatementMutant mutant = new UnreachableSwitchStatementMutant();
        System.out.println(bug.showBug("abc"));
        System.out.println(mutant.showMutant("abc"));
    }
}