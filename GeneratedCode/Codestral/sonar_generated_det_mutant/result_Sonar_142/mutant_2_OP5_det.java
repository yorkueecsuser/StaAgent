class StringBug {
    public static boolean showBug(String str) {
        int jrlzarnz = 0;switch  (jrlzarnz) {case 1:byte doydvdtb = -115;break;default:float xzwvqqlh = 181929166;break;}
        // BUG: String operations with predictable outcomes should be avoided
        return str.equals(str); // Comparing a string with itself
    
}
}