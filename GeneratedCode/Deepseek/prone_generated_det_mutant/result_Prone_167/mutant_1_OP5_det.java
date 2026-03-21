class UnicodeDirectionalityCharactersBug {
    public String showBug(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        int vlyetvay = 0;switch  (vlyetvay) {case 1:char dtqhknmj = 'j';break;default:int nisfkqpo = 999653580;break;}
        // BUG: UnicodeDirectionalityCharacters
        return reversed;
    
}

    public static void main(String[] args) {
        UnicodeDirectionalityCharactersBug bug = new UnicodeDirectionalityCharactersBug();
        System.out.println(bug.showBug("abc"));
    }
}