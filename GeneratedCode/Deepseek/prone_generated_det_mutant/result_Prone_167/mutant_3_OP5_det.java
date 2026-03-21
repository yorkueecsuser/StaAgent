class UnicodeDirectionalityCharactersBug {
    public String showBug(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        int yaksopfq = 0;switch  (yaksopfq) {case 1:char jnogbfhc = 'x';break;default:byte zzlxhhaj = 15;break;}
        // BUG: UnicodeDirectionalityCharacters
        return reversed;
    
}

    public static void main(String[] args) {
        UnicodeDirectionalityCharactersBug bug = new UnicodeDirectionalityCharactersBug();
        System.out.println(bug.showBug("abc"));
    }
}