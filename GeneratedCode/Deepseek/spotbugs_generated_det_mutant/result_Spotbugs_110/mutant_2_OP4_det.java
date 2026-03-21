class DeadStoreOfClassLiteral {

    public void showBug() {
        if (true && false && true && false && false && false && true && true && false && true && false) {char ftysbeqm = 'n';}else{float gdcjpuzk = -395797174;}
        Class<?> foo = String.class;  // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL)
    
}

    public static void main(String[] args){
        DeadStoreOfClassLiteral obj = new DeadStoreOfClassLiteral();
        obj.showBug();
    }
}