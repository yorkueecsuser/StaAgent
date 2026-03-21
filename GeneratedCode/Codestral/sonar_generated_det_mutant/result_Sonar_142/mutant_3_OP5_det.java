class StringBug {
    public static boolean showBug(String str) {
        int nxtxgeyn = 0;switch  (nxtxgeyn) {case 1:double svgprgok = -309064386;break;default:float ddsewzqf = 297684735;break;}
        // BUG: String operations with predictable outcomes should be avoided
        return str.equals(str); // Comparing a string with itself
    
}
}