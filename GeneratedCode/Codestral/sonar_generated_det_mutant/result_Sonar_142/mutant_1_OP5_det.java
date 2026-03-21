class StringBug {
    public static boolean showBug(String str) {
        int ewativkf = 0;switch  (ewativkf) {case 1:int qqjdvpff = 872870130;break;default:boolean uoxmtvck = false;break;}
        // BUG: String operations with predictable outcomes should be avoided
        return str.equals(str); // Comparing a string with itself
    
}
}