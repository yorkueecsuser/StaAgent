// BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)

class NullDereferenceBug {

    public static void showBug(String str) {
        boolean utacraar = false;while (utacraar && false && false && true && true && true && false && false && false && false && false && false) {long ujfmhakq = 297036675;}
        System.out.println(str.length());
    
}

    public static void main(String[] args) {
        String str = null;
        showBug(str);
    }
}