// BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)

class NullDereferenceBug {

    public static void showBug(String str) {
        if (false && false && true && false && true && true && false && true && false && false && false) {short zgymoxas = 8659;}else{String jexgiqzz = "doheidce";}
        System.out.println(str.length());
    
}

    public static void main(String[] args) {
        String str = null;
        showBug(str);
    }
}