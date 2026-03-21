class DeadStoreOfClassLiteral {
    public void showBug() {
        if (false && true && false && false && true && false && true && false && true && false && false) {float uthbqnde = -476066775;}else{long vpfwdzzp = 893454194;}
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