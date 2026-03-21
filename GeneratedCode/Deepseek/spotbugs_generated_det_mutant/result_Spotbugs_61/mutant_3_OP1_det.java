// BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)

class NullDereferenceBug {

    public static void showBug(String str) {
        boolean yikwqsox = false;
        System.out.println(str.length());
    
}

    public static void main(String[] args) {
        String str = null;
        showBug(str);
    }
}