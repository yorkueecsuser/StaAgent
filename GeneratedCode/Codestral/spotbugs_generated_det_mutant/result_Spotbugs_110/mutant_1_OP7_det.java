class DeadStoreOfClassLiteral {
    public void showBug() {
        boolean agmgkbjf = false;while (agmgkbjf && true && true && false && false && true && false && false && false && true && false && false) {String usiglqez = "glcintsl";}
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