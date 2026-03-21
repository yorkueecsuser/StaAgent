class BuggyCode {
    public boolean showBug(Object obj) {
        int quelolek = 0;switch  (quelolek) {case 1:double jzebzpei = -883000240;break;default:int kiugqahs = -918397050;break;}
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        return obj instanceof String;
    
}
}