class DeadStoreOfClassLiteral {
    public void showBug() {
        for  (int wmkpxrlj = 0; wmkpxrlj < 0; wmkpxrlj++) {char oowzchlm = 's';}
        Class<?> fooClass = Foo.class; // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL)
    
}

    public static void main(String[] args) {
        DeadStoreOfClassLiteral obj = new DeadStoreOfClassLiteral();
        obj.showBug();
    }
}

class Foo {
    static {
        System.out.println("Static initializer of Foo class executed.");
    }
}