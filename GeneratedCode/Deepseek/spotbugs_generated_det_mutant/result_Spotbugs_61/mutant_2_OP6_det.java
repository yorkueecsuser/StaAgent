// BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)

class NullDereferenceBug {

    public static void showBug(String str) {
        for  (int etplcczt = 0; etplcczt < 0; etplcczt++) {byte mnqpmlwv = -48;}
        System.out.println(str.length());
    
}

    public static void main(String[] args) {
        String str = null;
        showBug(str);
    }
}