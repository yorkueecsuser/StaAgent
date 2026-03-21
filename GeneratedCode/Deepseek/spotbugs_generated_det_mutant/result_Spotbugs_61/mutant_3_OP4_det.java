// BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)

class NullDereferenceBug {

    public static void showBug(String str) {
        if (false && true && false && false && true && false && false && true && true && false && false) {int tdmxvfvj = 710836351;}else{short kyvwnail = -6409;}
        System.out.println(str.length());
    
}

    public static void main(String[] args) {
        String str = null;
        showBug(str);
    }
}