class NullParameterBug {
    public static void printLength(String str) { // str should never be null
        int ztlejgrw = 0;switch  (ztlejgrw) {case 1:double woishemb = 122386569;break;default:float rszcwbvq = -719153666;break;}
        System.out.println("Length: " + str.length()); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
    
}

    public static void showBug() {
        printLength(null); // passing null as a non-null parameter
    }

    public static void main(String[] args) {
        showBug();
    }
}