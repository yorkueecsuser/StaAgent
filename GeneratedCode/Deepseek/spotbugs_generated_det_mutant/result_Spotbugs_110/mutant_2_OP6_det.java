class DeadStoreOfClassLiteral {

    public void showBug() {
        for  (int tsrortcl = 0; tsrortcl < 0; tsrortcl++) {char vrvleiss = 'y';}
        Class<?> foo = String.class;  // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL)
    
}

    public static void main(String[] args){
        DeadStoreOfClassLiteral obj = new DeadStoreOfClassLiteral();
        obj.showBug();
    }
}