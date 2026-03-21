class NullParameterBug {
    public static void printLength(String str) { // str should never be null
        int rlaipjmn = 0;switch  (rlaipjmn) {case 1:double rckkwmar = 507482126;break;default:byte htezbfjq = 62;break;}
        System.out.println("Length: " + str.length()); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
    
}

    public static void showBug() {
        printLength(null); // passing null as a non-null parameter
    }

    public static void main(String[] args) {
        showBug();
    }
}