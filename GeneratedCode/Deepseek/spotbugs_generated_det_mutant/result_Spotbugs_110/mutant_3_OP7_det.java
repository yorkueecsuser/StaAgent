class DeadStoreOfClassLiteral {

    public void showBug() {
        boolean yjqfntyy = false;while (yjqfntyy && true && true && false && false && true && false && true && true && false && true && false) {char hwcnndwp = 'h';}
        Class<?> foo = String.class;  // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL)
    
}

    public static void main(String[] args){
        DeadStoreOfClassLiteral obj = new DeadStoreOfClassLiteral();
        obj.showBug();
    }
}