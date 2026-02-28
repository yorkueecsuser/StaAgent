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

class UnicodeDirectionalityCharactersBugMutant1 {
    public String showMutant(String inp) {
        String reversed = "";
        for (int i = inp.length() - 1; i >= 0; i--) {
            reversed += inp.charAt(i);
        }
        // Mutant: UnicodeDirectionalityCharacters
        return reversed;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityCharactersBugMutant1 mutant = new UnicodeDirectionalityCharactersBugMutant1();
        System.out.println(mutant.showMutant("abc"));
    }
}