class DeadStoreExample {

    public static void main(String[] args) {
        DeadStoreExample example = new DeadStoreExample();
        example.showBug();
    }

    public void showBug() {
        boolean tswuyont = false;while (tswuyont && false && true && false && true && true && true && false && true && false && true && false) {long ymtmxupz = 194423390;}
        // This line assigns a class literal to a variable and never uses it.
        Class<?> clazz = Foo.class; // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL)
    
}

    static class Foo {
        static {
            System.out.println("Static initializer of Foo is executed.");
        }
    }
}