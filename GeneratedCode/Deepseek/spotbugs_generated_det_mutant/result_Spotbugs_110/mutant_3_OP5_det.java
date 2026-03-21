class DeadStoreOfClassLiteral {

    public void showBug() {
        int djmnshcc = 0;switch  (djmnshcc) {case 1:char tyeihftg = 'f';break;default:long ctcttpvf = 330166245;break;}
        Class<?> foo = String.class;  // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL)
    
}

    public static void main(String[] args){
        DeadStoreOfClassLiteral obj = new DeadStoreOfClassLiteral();
        obj.showBug();
    }
}