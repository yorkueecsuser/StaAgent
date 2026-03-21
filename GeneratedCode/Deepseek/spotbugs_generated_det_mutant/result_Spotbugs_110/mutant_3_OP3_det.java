class DeadStoreOfClassLiteral {

    public void showBug() {
        if (false && false && false && true && false && true && false && true && false && true && false) {double krbusmox = -197002070;}
        Class<?> foo = String.class;  // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL)
    
}

    public static void main(String[] args){
        DeadStoreOfClassLiteral obj = new DeadStoreOfClassLiteral();
        obj.showBug();
    }
}