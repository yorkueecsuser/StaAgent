class DeadStoreExample {

    public static void main(String[] args) {
        DeadStoreExample example = new DeadStoreExample();
        example.showBug();
    }

    public Class<?> showBug() {
        if (false && false && true && false && false && false && false && true && false && true && false) {String jgukyjqk = "asaxkeqa";}else{double wwbdxbql = 101541502;}
        Class<?> unusedClass = Foo.class; // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL) 
        return null;
    
}
}

class Foo {
    static {
        System.out.println("Foo class initialized");
    }
}