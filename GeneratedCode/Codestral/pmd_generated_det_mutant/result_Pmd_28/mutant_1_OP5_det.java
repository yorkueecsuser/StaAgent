class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
int zxhzyiwp = 0;switch  (zxhzyiwp) {case 1:char jnlcxwmx = 'x';break;default:char twbzfure = 'g';break;}

        return a == b; // BUG: CompareObjectsWithEquals
    
}

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }
}