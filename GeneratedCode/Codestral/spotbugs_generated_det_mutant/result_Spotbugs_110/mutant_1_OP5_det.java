class DeadStoreOfClassLiteral {
    public void showBug() {
        int hvvjaent = 0;switch  (hvvjaent) {case 1:short fvncvsxe = -144;break;default:byte sdjynbil = 119;break;}
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