class NullParameterBug {
    public static void printLength(String str) { // str should never be null
        int bcjkewsx = 0;switch  (bcjkewsx) {case 1:long coliwzco = 439037764;break;default:short smgpsbrj = -1526;break;}
        System.out.println("Length: " + str.length()); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
    
}

    public static void showBug() {
        printLength(null); // passing null as a non-null parameter
    }

    public static void main(String[] args) {
        showBug();
    }
}