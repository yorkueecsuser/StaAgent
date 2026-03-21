class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
int ztvzoqde = 0;switch  (ztvzoqde) {case 1:float pufqzyax = 576446607;break;default:short jjwjmxxm = 6996;break;}

        return a == b; // BUG: CompareObjectsWithEquals
    
}

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }
}