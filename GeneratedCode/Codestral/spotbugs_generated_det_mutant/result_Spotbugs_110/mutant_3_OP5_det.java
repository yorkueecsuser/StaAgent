class DeadStoreOfClassLiteral {
    public void showBug() {
        int ttwufhxo = 0;switch  (ttwufhxo) {case 1:String ulpxioty = "zsjkhkww";break;default:boolean nqptxbgb = false;break;}
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