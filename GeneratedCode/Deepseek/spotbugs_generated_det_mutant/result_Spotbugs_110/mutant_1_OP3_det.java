class DeadStoreOfClassLiteral {

    public void showBug() {
        if (false && false && false && false && true && true && true && false && true && true && false) {short doiypfeu = 5318;}
        Class<?> foo = String.class;  // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL)
    
}

    public static void main(String[] args){
        DeadStoreOfClassLiteral obj = new DeadStoreOfClassLiteral();
        obj.showBug();
    }
}