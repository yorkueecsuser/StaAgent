class DeadStoreOfClassLiteral {

    public void showBug() {
        if (true && false && true && true && true && true && true && true && false && true && false) {float hhvxzpef = -624469647;}else{boolean moptpqqy = false;}
        Class<?> foo = String.class;  // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL)
    
}

    public static void main(String[] args){
        DeadStoreOfClassLiteral obj = new DeadStoreOfClassLiteral();
        obj.showBug();
    }
}