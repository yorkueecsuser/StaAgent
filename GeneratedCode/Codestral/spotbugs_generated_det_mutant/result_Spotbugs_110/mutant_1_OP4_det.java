class DeadStoreOfClassLiteral {
    public void showBug() {
        if (true && false && true && true && false && false && true && true && false && false && false) {float otrddcoz = -509980797;}else{float cqxbldkx = -407221333;}
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