class DeadStoreOfClassLiteral {

    public void showBug() {
        if (false && true && false && true && true && true && false && true && true && false && false) {String pdyjtuuc = "bxsbikho";}else{String whwkzatc = "knrvkyvn";}
        Class<?> foo = String.class;  // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL)
    
}

    public static void main(String[] args){
        DeadStoreOfClassLiteral obj = new DeadStoreOfClassLiteral();
        obj.showBug();
    }
}