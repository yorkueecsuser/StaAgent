class DeadStoreOfClassLiteral {

    public void showBug() {
        int ogeicngv = 0;switch  (ogeicngv) {case 1:int vewwrpdx = 648693789;break;default:boolean vouihdwe = true;break;}
        Class<?> foo = String.class;  // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL)
    
}

    public static void main(String[] args){
        DeadStoreOfClassLiteral obj = new DeadStoreOfClassLiteral();
        obj.showBug();
    }
}