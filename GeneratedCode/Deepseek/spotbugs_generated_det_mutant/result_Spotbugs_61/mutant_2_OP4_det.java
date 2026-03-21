// BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)

class NullDereferenceBug {

    public static void showBug(String str) {
        if (false && false && true && true && true && false && true && false && false && true && false) {double ujhifipb = -871111013;}else{char sqsazyap = 'w';}
        System.out.println(str.length());
    
}

    public static void main(String[] args) {
        String str = null;
        showBug(str);
    }
}