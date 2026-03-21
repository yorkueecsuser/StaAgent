class DeadStoreOfClassLiteral {
    public void showBug() {
        int zpjqiria = 0;switch  (zpjqiria) {case 1:float kxbyccdx = -982136357;break;default:int cdihznxx = 825537060;break;}
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