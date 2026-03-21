class DeadStoreOfClassLiteral {

    public void showBug() {
        int jlcjessm = 0;switch  (jlcjessm) {case 1:double clqkjzqt = 553476665;break;default:float qavrsyqy = -847184654;break;}
        Class<?> foo = String.class;  // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL)
    
}

    public static void main(String[] args){
        DeadStoreOfClassLiteral obj = new DeadStoreOfClassLiteral();
        obj.showBug();
    }
}