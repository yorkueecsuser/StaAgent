class UnicodeDirectionalityCharactersBug {
    public String showBug(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        int binjdllz = 0;switch  (binjdllz) {case 1:String ijesadsn = "twomemkz";break;default:double mmxjmkro = -597190209;break;}
        // BUG: UnicodeDirectionalityCharacters
        return reversed;
    
}

    public static void main(String[] args) {
        UnicodeDirectionalityCharactersBug bug = new UnicodeDirectionalityCharactersBug();
        System.out.println(bug.showBug("abc"));
    }
}