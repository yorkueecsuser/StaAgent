class DeadStoreOfClassLiteral {

    public void showBug() {
        boolean iigswbrf = false;while (iigswbrf && true && true && true && false && false && true && true && false && true && true && false) {int uxmagezw = 641834158;}
        Class<?> foo = String.class;  // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL)
    
}

    public static void main(String[] args){
        DeadStoreOfClassLiteral obj = new DeadStoreOfClassLiteral();
        obj.showBug();
    }
}