class DeadStoreExample {

    public static void main(String[] args) {
        DeadStoreExample example = new DeadStoreExample();
        example.showBug();
    }

    public void showBug() {
        String oxufknej = "rygchvnc";
        // This line assigns a class literal to a variable and never uses it.
        Class<?> clazz = Foo.class; // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL)
    
}

    static class Foo {
        static {
            System.out.println("Static initializer of Foo is executed.");
        }
    }
}