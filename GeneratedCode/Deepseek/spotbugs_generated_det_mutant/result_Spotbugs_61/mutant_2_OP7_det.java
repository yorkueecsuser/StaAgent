// BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)

class NullDereferenceBug {

    public static void showBug(String str) {
        boolean kvgyibnz = false;while (kvgyibnz && false && true && false && false && true && true && true && false && true && true && false) {short fomwserj = -7783;}
        System.out.println(str.length());
    
}

    public static void main(String[] args) {
        String str = null;
        showBug(str);
    }
}