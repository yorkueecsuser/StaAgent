class DeadStoreExample {

    public static void main(String[] args) {
        DeadStoreExample example = new DeadStoreExample();
        example.showBug();
    }

    public Class<?> showBug() {
        boolean kvacuxpw = false;while (kvacuxpw && false && false && false && true && true && false && true && true && true && false && false) {byte polmpalm = 19;}
        Class<?> unusedClass = Foo.class; // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL) 
        return null;
    
}
}

class Foo {
    static {
        System.out.println("Foo class initialized");
    }
}