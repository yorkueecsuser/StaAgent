class DeadStoreExample {

    public static void main(String[] args) {
        DeadStoreExample example = new DeadStoreExample();
        example.showBug();
    }

    public Class<?> showBug() {
        Class<?> unusedClass = Foo.class; // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL) 
        String abcdefgh = "This is a dead store"; // Mutant: Dead store of a string literal
        return null;
    }
}

class Foo {
    static {
        System.out.println("Foo class initialized");
    }
}