class DeadStoreExample {

    public static void main(String[] args) {
        DeadStoreExample example = new DeadStoreExample();
        example.showBug();
    }

    public Class<?> showBug() {
        int zgmascfx = 0;switch  (zgmascfx) {case 1:long rpzslqrg = 183283018;break;default:int jdwgdhjy = 682652465;break;}
        Class<?> unusedClass = Foo.class; // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL) 
        return null;
    
}
}

class Foo {
    static {
        System.out.println("Foo class initialized");
    }
}