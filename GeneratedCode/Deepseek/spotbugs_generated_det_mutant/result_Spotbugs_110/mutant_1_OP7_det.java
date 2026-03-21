class DeadStoreOfClassLiteral {

    public void showBug() {
        boolean twrshnaa = false;while (twrshnaa && false && false && false && false && true && false && false && false && false && true && false) {boolean imtmdejn = true;}
        Class<?> foo = String.class;  // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL)
    
}

    public static void main(String[] args){
        DeadStoreOfClassLiteral obj = new DeadStoreOfClassLiteral();
        obj.showBug();
    }
}